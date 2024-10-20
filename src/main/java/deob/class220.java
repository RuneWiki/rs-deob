package deob;

@ObfuscatedName("ii")
public class class220 extends class500 {

    @ObfuscatedName("ii.al")
    public static class312 field2239 = new class312(64);

    @ObfuscatedName("ii.aj")
    public char field2236;

    @ObfuscatedName("ii.az")
    public int field2237;

    @ObfuscatedName("ii.af")
    public String field2238;

    @ObfuscatedName("ii.aa")
    public boolean field2235 = true;

    @ObfuscatedName("df.ak(Lor;B)V")
    public static void method2223(class387 arg0) {
        Statics.field4644 = arg0;
    }

    @ObfuscatedName("ku.al(IS)Lii;")
    public static class220 method5373(int arg0) {
        class220 var1 = (class220) field2239.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4644.method6573(11, arg0);
        class220 var3 = new class220();
        if (var2 != null) {
            var3.method3783(new class546(var2));
        }
        var3.method3782();
        field2239.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.aj(I)V")
    public void method3782() {
    }

    @ObfuscatedName("ii.az(Lua;I)V")
    public void method3783(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3784(arg0, var2);
        }
    }

    @ObfuscatedName("ii.af(Lua;IB)V")
    public void method3784(class546 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2236 = class413.method3101(arg0.method8797());
        } else if (arg1 == 2) {
            this.field2237 = arg0.method8801();
        } else if (arg1 == 4) {
            this.field2235 = false;
        } else if (arg1 == 5) {
            this.field2238 = arg0.method8806();
        }
    }

    @ObfuscatedName("ii.aa(I)Z")
    public boolean method3800() {
        return this.field2236 == 's';
    }
}
