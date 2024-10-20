package deob;

@ObfuscatedName("tq")
public class class519 implements class388 {

    @ObfuscatedName("tq.am")
    public static final class519 field5110 = new class519(2, 0, Integer.class, new class516());

    @ObfuscatedName("tq.ap")
    public static final class519 field5103 = new class519(1, 1, Long.class, new class518());

    @ObfuscatedName("tq.af")
    public static final class519 field5104 = new class519(0, 2, String.class, new class520());

    @ObfuscatedName("tq.aj")
    public final int field5105;

    @ObfuscatedName("tq.aq")
    public final int field5108;

    @ObfuscatedName("tq.ar")
    public final Class field5107;

    @ObfuscatedName("tq.ag")
    public final class515 field5111;

    @ObfuscatedName("tq.am(I)[Ltq;")
    public static class519[] method8439() {
        return new class519[] { field5103, field5104, field5110 };
    }

    public class519(int arg0, int arg1, Class arg2, class515 arg3) {
        this.field5105 = arg0;
        this.field5108 = arg1;
        this.field5107 = arg2;
        this.field5111 = arg3;
    }

    @ObfuscatedName("tq.af(Ljava/lang/Object;Luk;I)V")
    public static void method8427(Object arg0, class531 arg1) {
        Class var2 = arg0.getClass();
        class519[] var3 = method8439();
        int var4 = 0;
        class519 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class519 var5 = var3[var4];
            if (var5.field5107 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            throw new IllegalArgumentException();
        }
        class515 var8 = var6.field5111;
        var8.method8412(arg0, arg1);
    }

    @ObfuscatedName("tq.ap(I)I")
    public int method34() {
        return this.field5108;
    }

    @ObfuscatedName("tq.aj(Luk;I)Ljava/lang/Object;")
    public Object method8428(class531 arg0) {
        return this.field5111.method8411(arg0);
    }
}
