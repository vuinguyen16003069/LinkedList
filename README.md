# MyLinkedList (Java)

Đây là một cài đặt **danh sách liên kết đơn (Singly Linked List)** bằng Java.  
Code minh họa các thao tác cơ bản trên danh sách liên kết:

- Thêm phần tử (đầu, cuối, vị trí bất kỳ).
- Xóa phần tử (đầu, cuối, vị trí bất kỳ).
- Duyệt và in danh sách.

---

## 📂 Cấu trúc lớp

### Lớp `Node`
- Mỗi node gồm:
  - `int value`: giá trị.
  - `Node next`: con trỏ tới node tiếp theo.
- Hàm tạo: `Node(int value)`.

### Lớp `MyLinkedList`
- Chứa các phương thức tĩnh (static) để thao tác trên danh sách.

---

## ⚙️ Các phương thức chính

### 1. In danh sách
```java
printLinkedList(Node head)
