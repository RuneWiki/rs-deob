package deob;

@ObfuscatedName("sm")
public abstract class class471 extends class296 implements class538 {

    public class471(class363 arg0, class389 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("sm.al(I)I")
    public int method7689() {
        return this.field3110;
    }

    @ObfuscatedName("sm.ak(II)Ljava/lang/Object;")
    public Object method7687(int arg0) {
        class473 var2 = this.method7688(arg0);
        return var2 != null && var2.method7706() ? var2.method7709() : null;
    }

    @ObfuscatedName("sm.ax(Lul;I)Lut;")
    public class539 method7690(class530 arg0) {
        int var2 = arg0.method8598();
        class473 var3 = this.method7688(var2);
        class539 var4 = new class539(var2);
        Class var5 = var3.field4817.field5071;
        if (var5 == Integer.class) {
            var4.field5205 = arg0.method8371();
        } else if (var5 == Long.class) {
            var4.field5205 = arg0.method8573();
        } else if (var5 == String.class) {
            var4.field5205 = arg0.method8377();
        } else if (class534.class.isAssignableFrom(var5)) {
            try {
                class534 var6 = (class534) var5.getDeclaredConstructor().newInstance();
                var6.method8665(arg0, (byte) -29);
                var4.field5205 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("sm.ac(II)Lsl;")
    public abstract class473 method7688(int arg0);
}
