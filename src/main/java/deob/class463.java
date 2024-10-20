package deob;

import java.util.zip.Inflater;

@ObfuscatedName("qm")
public class class463 {

    @ObfuscatedName("qm.c")
    public Inflater field4856;

    public class463() {
        this(-1, 1000000, 1000000);
    }

    public class463(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("qm.c(Lqq;[BI)V")
    public void method7768(class445 arg0, byte[] arg1) {
        if (arg0.field4733[arg0.field4735] != 31 || arg0.field4733[arg0.field4735 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4856 == null) {
            this.field4856 = new Inflater(true);
        }
        try {
            this.field4856.setInput(arg0.field4733, arg0.field4735 + 10, arg0.field4733.length - (arg0.field4735 + 10 + 8));
            this.field4856.inflate(arg1);
        } catch (Exception var4) {
            this.field4856.reset();
            throw new RuntimeException("");
        }
        this.field4856.reset();
    }
}
