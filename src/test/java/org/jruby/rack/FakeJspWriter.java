/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jruby.rack;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author tyler
 */
public class FakeJspWriter extends JspWriter{
    private StringBuilder sb = new StringBuilder();

    public FakeJspWriter() {
        super(0, false);
    }
    
    public String toString() {
        return sb.toString();
    }
    
    @Override
    public void write(String str) throws IOException {
        sb.append(str);
    }
    
    @Override
    public void write(char[] arg0, int arg1, int arg2) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clearBuffer() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void flush() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRemaining() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void newLine() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(boolean arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(char arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(int arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(long arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(float arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(double arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(char[] arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(String arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void print(Object arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(boolean arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(char arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(int arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(long arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(float arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(double arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(char[] arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(String arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void println(Object arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
