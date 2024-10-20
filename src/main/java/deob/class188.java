package deob;

import java.util.zip.Inflater;

@ObfuscatedName("gc")
public class class188 {

    @ObfuscatedName("gc.c")
    public Inflater field2511;

    public class188() {
        this(-1, 1000000, 1000000);
    }

    public class188(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gc.c(Lgp;[BI)V")
    public void method3160(class195 arg0, byte[] arg1) {
        if (arg0.field2567[arg0.field2566] != 31 || arg0.field2567[arg0.field2566 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2511 == null) {
            this.field2511 = new Inflater(true);
        }
        try {
            this.field2511.setInput(arg0.field2567, arg0.field2566 + 10, arg0.field2567.length - (arg0.field2566 + 10 + 8));
            this.field2511.inflate(arg1);
        } catch (Exception var4) {
            this.field2511.reset();
            throw new RuntimeException("");
        }
        this.field2511.reset();
    }
}
