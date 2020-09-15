import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MotorcylesComponent } from './motorcyles.component';

describe('MotorcylesComponent', () => {
  let component: MotorcylesComponent;
  let fixture: ComponentFixture<MotorcylesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MotorcylesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MotorcylesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
