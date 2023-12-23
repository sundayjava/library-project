class HistoryModel {
  id: number;
  userEmail: string;
  checkedoutDate: string;
  returnedDate: string;
  title: string;
  author: string;
  description: string;
  img: string;

  constructor(
    id: number,
    userEmail: string,
    checkedoutDate: string,
    returnedDate: string,
    title: string,
    author: string,
    description: string,
    img: string
  ) {
    this.id = id;
    this.userEmail = userEmail;
    this.checkedoutDate = checkedoutDate;
    this.returnedDate = returnedDate;
    this.title = title;
    this.author = author;
    this.description = description;
    this.img = img;
  }
}

export default HistoryModel;
