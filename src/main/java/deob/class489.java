package deob;

@ObfuscatedName("sg")
public abstract class class489 extends class309 implements class557 {

    public class489(class376 arg0, class404 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("sg.ay(I)I")
    public int method8153() {
        return this.field3236;
    }

    @ObfuscatedName("sg.an(IB)Ljava/lang/Object;")
    public Object method8141(int arg0) {
        class491 var2 = this.method8144(arg0);
        return var2 != null && var2.method8160() ? var2.method8161() : null;
    }

    @ObfuscatedName("sg.au(Lvg;I)Lvy;")
    public class558 method8143(class549 arg0) {
        int var2 = arg0.method8968();
        class491 var3 = this.method8144(var2);
        class558 var4 = new class558(var2);
        Class var5 = var3.field5020.field5298;
        if (var5 == Integer.class) {
            var4.field5446 = arg0.method8803();
        } else if (var5 == Long.class) {
            var4.field5446 = arg0.method8804();
        } else if (var5 == String.class) {
            var4.field5446 = arg0.method8827();
        } else if (class553.class.isAssignableFrom(var5)) {
            try {
                class553 var6 = (class553) var5.getDeclaredConstructor().newInstance();
                var6.method9088(arg0, -799421146);
                var4.field5446 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("sg.ab(II)Lst;")
    public abstract class491 method8144(int arg0);
}
