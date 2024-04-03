import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { CompetenciasComponent } from './components/competencias/competencias.component';
import { AltaCompetenciaComponent } from './components/competencias/alta-competencia/alta-competencia.component';

const routes: Routes = [
{path:'', redirectTo: 'login',pathMatch:'full'},
{path: 'login', component: LoginComponent},
{path: 'competencia', component: CompetenciasComponent},
{path: 'alta-competencia', component: AltaCompetenciaComponent},
{path:'**', redirectTo:'login', pathMatch:'full'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
