package ch.tsimwi.amt.services;

import ch.heigvd.amt.framework.api.ServiceTest;
import ch.heigvd.amt.framework.exceptions.InvalidOperationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotivationalServiceTest extends ServiceTest {

  @BeforeEach
  void setupService() {
    service = new MotivationalService();
  }

  @Test
  void itShouldProvideAMotivationalSpeechOperation() throws InvalidOperationException {
    String value = service.execute(MotivationalService.OPERATION_TELL_MOTIVATIONAL_SPEECH, null);
    assertNotNull(value);
  }

}