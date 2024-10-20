package deob;

import java.util.zip.Inflater;

@ObfuscatedName("qj")
public class class461 {

    @ObfuscatedName("qj.c")
    public Inflater field4823;

    public class461() {
        this(-1, 1000000, 1000000);
    }

    public class461(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("qj.c(Lqt;[BI)V")
    public void method7610(class443 arg0, byte[] arg1) {
        if (arg0.field4701[arg0.field4700] != 31 || arg0.field4701[arg0.field4700 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4823 == null) {
            this.field4823 = new Inflater(true);
        }
        try {
            this.field4823.setInput(arg0.field4701, arg0.field4700 + 10, arg0.field4701.length - (arg0.field4700 + 10 + 8));
            this.field4823.inflate(arg1);
        } catch (Exception var4) {
            this.field4823.reset();
            throw new RuntimeException("");
        }
        this.field4823.reset();
    }
}
