import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ErrorDialogComponent } from './componentes/error-dialog/error-dialog.component';
import { AppMaterialModule } from './app-material/app-material.module';
import { CategoryPipe } from './pipes/category.pipe';



@NgModule({
  declarations: [
    ErrorDialogComponent,
    CategoryPipe,
  ],
  imports: [
    CommonModule,
    AppMaterialModule
  ],
  exports: [
    CategoryPipe,
    ErrorDialogComponent
  ]
})
export class SharedModule { }
