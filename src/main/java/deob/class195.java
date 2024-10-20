package deob;

import java.util.zip.Inflater;

@ObfuscatedName("go")
public class class195 {

    @ObfuscatedName("go.m")
    public Inflater field2375;

    public class195() {
        this(-1, 1000000, 1000000);
    }

    public class195(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("go.m(Lgr;[BB)V")
    public void method3347(class202 arg0, byte[] arg1) {
        if (arg0.field2440[arg0.field2439] != 31 || arg0.field2440[arg0.field2439 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2375 == null) {
            this.field2375 = new Inflater(true);
        }
        try {
            this.field2375.setInput(arg0.field2440, arg0.field2439 + 10, arg0.field2440.length - (arg0.field2439 + 10 + 8));
            this.field2375.inflate(arg1);
        } catch (Exception var4) {
            this.field2375.reset();
            throw new RuntimeException("");
        }
        this.field2375.reset();
    }
}
