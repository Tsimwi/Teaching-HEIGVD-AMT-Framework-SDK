package ch.tsimwi.amt.services;

import ch.heigvd.amt.framework.api.IService;
import ch.heigvd.amt.framework.exceptions.InvalidOperationException;

import java.util.List;

public class MotivationalService implements IService {
  public static final String SERVICE_NAME = "motivationalService";
  public static final String OPERATION_TELL_MOTIVATIONAL_SPEECH = "tellMotivationalSpeech";

  @Override
  public String execute(String operationName, List<String> parameterValues) throws InvalidOperationException {
    switch (operationName) {
      case OPERATION_TELL_MOTIVATIONAL_SPEECH:
        return "Do it. Don't let your dreams be dreams. Nothing is impossible. Yesterday you said tomorrow. You should " +
                "get to the point where anyone else would quit and you're not going to stop there. So just DO IT!";
      default:
        throw new InvalidOperationException("Operation " + operationName + " is not valid.");
    }
  }

  @Override
  public String getHelpMessage() {
    return "service: " + this.getClass().getCanonicalName() + "\r\n"
      + " operation: " + OPERATION_TELL_MOTIVATIONAL_SPEECH + " (no arguments)";
  }
}
