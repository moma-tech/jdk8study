package onjava_2.tools;

import onjava_2.OSExecuteException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * OSExecute
 *
 * <p>// onjava/OSExecute.java // (c)2021 MindView LLC: see Copyright.txt // We make no guarantees
 * that this code is fit for any purpose. // Visit http://OnJava8.com for more book information. //
 * Run an operating system command // and send the output to the consol
 *
 * @version 1.0
 * @author Created by ivan at 15:22.
 */
public class OSExecute {
  public static void command(String command) {
    boolean err = false;
    try {
      Process process = new ProcessBuilder(command.split(" ")).start();
      try (BufferedReader results =
              new BufferedReader(new InputStreamReader(process.getInputStream()));
          BufferedReader errors =
              new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
        results.lines().forEach(System.out::println);
        err = errors.lines().peek(System.err::println).count() > 0;
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    if (err) throw new OSExecuteException("Errors executing " + command);
  }

  public static void javapCp(String path, String clazz) {
    OSExecute.command("javap -cp " + path + " " + clazz);
  }
}
