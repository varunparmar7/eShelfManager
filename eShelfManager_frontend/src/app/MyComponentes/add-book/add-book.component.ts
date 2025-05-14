import { Component, OnInit } from '@angular/core';
import { BooksService } from '../../books.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrl: './add-book.component.css'
})
export class AddBookComponent implements OnInit{
  book = { isbn: '', title: '', aName: '', genre:''};

  constructor(private booksService: BooksService) {}

  ngOnInit(): void {}

  onSubmit() {
    this.booksService.postBook(this.book).subscribe(response => {
      console.log('Book added successfully:', response);
      this.book = { isbn: '', title: '', aName: '', genre:''};
    }, error => {
      console.error('Error adding book:', error);
    });
  }
}
