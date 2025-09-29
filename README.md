# 📘 MyLinkedList (Java)

**Họ tên:** Nguyễn Quang Vui  
**ID:** 108958

Đây là phần cài đặt **Danh sách liên kết đơn (Singly Linked List)** bằng ngôn ngữ Java.  
Mã nguồn minh họa các thao tác cơ bản như:

✅ Thêm phần tử  
✅ Xóa phần tử  
✅ Duyệt và in danh sách

---

## 📂 Cấu trúc chương trình

### 🔹 Lớp `Node`
Đại diện cho một phần tử trong danh sách.

```java
public static class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}
