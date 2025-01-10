import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PhotobookingComponent } from './photobooking.component';

describe('PhotobookingComponent', () => {
  let component: PhotobookingComponent;
  let fixture: ComponentFixture<PhotobookingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PhotobookingComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PhotobookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
