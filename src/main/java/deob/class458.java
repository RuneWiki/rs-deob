package deob;

import java.util.zip.Inflater;

@ObfuscatedName("qj")
public class class458 {

    @ObfuscatedName("qj.o")
    public Inflater field4799;

    public class458() {
        this(-1, 1000000, 1000000);
    }

    public class458(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("qj.o(Lpx;[BI)V")
    public void method7483(class440 arg0, byte[] arg1) {
        if (arg0.field4679[arg0.field4678] != 31 || arg0.field4679[arg0.field4678 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4799 == null) {
            this.field4799 = new Inflater(true);
        }
        try {
            this.field4799.setInput(arg0.field4679, arg0.field4678 + 10, arg0.field4679.length - (arg0.field4678 + 10 + 8));
            this.field4799.inflate(arg1);
        } catch (Exception var4) {
            this.field4799.reset();
            throw new RuntimeException("");
        }
        this.field4799.reset();
    }
}
