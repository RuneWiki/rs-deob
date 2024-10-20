package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fd")
public class class178 {

    @ObfuscatedName("fd.a")
    public Inflater field2449;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fd.a(Lgh;[BB)V")
    public void method2901(class185 arg0, byte[] arg1) {
        if (arg0.field2512[arg0.field2509] != 31 || arg0.field2512[arg0.field2509 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2449 == null) {
            this.field2449 = new Inflater(true);
        }
        try {
            this.field2449.setInput(arg0.field2512, arg0.field2509 + 10, arg0.field2512.length - (arg0.field2509 + 10 + 8));
            this.field2449.inflate(arg1);
        } catch (Exception var4) {
            this.field2449.reset();
            throw new RuntimeException("");
        }
        this.field2449.reset();
    }
}
