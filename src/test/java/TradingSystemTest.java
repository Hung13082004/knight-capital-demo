import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradingSystemTest {

    @Test
    public void testLogicGiaoDich() {
        System.out.println("🚀 Đang chạy Unit Test cho TradingSystem...");
        
        int ketQuaThucTe = 1; // Giả sử đây là kết quả hàm của bạn trả về
        int ketQuaMongDoi = 1;
        
        // Kiểm tra xem kết quả thực tế có khớp với mong đợi không
        // MẸO DEMO: Nếu bạn muốn bẫy cho Pipeline báo lỗi (đỏ) ngay tại đây, hãy đổi số 1 thành số 2.
        assertEquals(ketQuaMongDoi, ketQuaThucTe, "Lỗi logic: Kết quả không khớp!");
    }
}