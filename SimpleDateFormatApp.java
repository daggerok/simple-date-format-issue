import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

  // Not thread-safe, JDK8: Use DateTImeFormat instead:
  static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

  // Bad: don't do this
  String unsafeFormatter(Date date) {
    return simpleDateFormat.format(date);
  }

  // Better: blocking, but thread-safe
  synchronized String saferFormatter(Date date) {
    return simpleDateFormat.format(date);
  }
}
