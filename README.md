# gRPC-demo
# Tìm hiểu về gRPC:
- Trong hệ thống microservices lớn thì thường các service sẽ dùng những ngôn ngữ khác nhau (Java, Python, Golang,..) vì vậy thì sự giao tiếp giữa các service sẽ trở
nên khó khăn hơn, vì vậy gRPC giúp ích rất nhiều trong việc đồng bộ các service với nhau.
- gRPC là một framework RPC (RPC là một kỹ thuật tiến bộ cho quá trình kết nối từ Client đến Serᴠer để ѕử dụng các ứng dụng ᴠà dịch ᴠụ) được phát triển bởi Google.
- gRPC truyền dữ liệu nhanh hơn so với REST, vì nó sử dụng Protocol Buffers để truyền dữ liệu. Nó nhẹ hơn XML, JSon. Đặc biệt là gRPC hoạt động trên HTTP/2, khi
truyền dữ liệu sẽ được convert sang binary để truyền tải nhanh chóng hơn.
- Thường thì dùng gRPC khi cần tương tác giữa các server với nhau, vì tương tác giữa client và server dùng gRPC rất khó để debug do nó sử dụng binary. 
## RPC
- RPC là từ viết tắc của Remote Procedure Call, nó được xây dựng với ý tưởng là đơn giản hoá việc giao tiếp giữa những service với nhau, thay vì những service giao tiếp với nhau theo kiểu RESTful API thì giờ đơn giản là gọi hàm như những object nói chuyện với nhau thôi, còn việc phân tán các service là chuyện của tương lai không dính liếu đến việc code.

## Protocal Buffer
- Protocal Buffer được tạo ra với ý tưởng là làm nhỏ kích thước data truyền đi trong giao tiếp và chỉ cần định nghĩa một lần và sử dụng cho các service với các ngôn ngữ lập trình khác nhau.

## HTTP/2
- HTTP/2 là một phiên bản nâng cấp của HTTP/1.1, HTTP/2 sinh với với mục đích cải thiện tốc độ giao tiếp giữa client/server trên nền tảng Web.

## Test login in case success
![](src/main/image/success.png)
## Test login in case fail
![](src/main/image/fail.png)
