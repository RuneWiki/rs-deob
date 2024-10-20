package deob;

@ObfuscatedName("fs")
public class class157 extends class365 {

    @ObfuscatedName("fs.f")
    public static class236 field1675 = new class236(64);

    @ObfuscatedName("fs.j")
    public static class236 field1687 = new class236(64);

    @ObfuscatedName("fs.m")
    public int field1676;

    @ObfuscatedName("fs.a")
    public int field1685 = 255;

    @ObfuscatedName("fs.e")
    public int field1678 = 255;

    @ObfuscatedName("fs.i")
    public int field1679 = -1;

    @ObfuscatedName("fs.y")
    public int field1680 = 1;

    @ObfuscatedName("fs.w")
    public int field1681 = 70;

    @ObfuscatedName("fs.g")
    public int field1682 = -1;

    @ObfuscatedName("fs.v")
    public int field1674 = -1;

    @ObfuscatedName("fs.s")
    public int field1684 = 30;

    @ObfuscatedName("fs.c")
    public int field1677 = 0;

    @ObfuscatedName("cu.l(Lkl;Lkl;B)V")
    public static void method2157(class290 arg0, class290 arg1) {
        Statics.field1683 = arg0;
        Statics.field1673 = arg1;
    }

    @ObfuscatedName("fs.q(Lot;B)V")
    public void method2724(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2715(arg0, var2);
        }
    }

    @ObfuscatedName("fs.f(Lot;II)V")
    public void method2715(class401 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method6284();
        } else if (arg1 == 2) {
            this.field1685 = arg0.method6272();
        } else if (arg1 == 3) {
            this.field1678 = arg0.method6272();
        } else if (arg1 == 4) {
            this.field1679 = 0;
        } else if (arg1 == 5) {
            this.field1681 = arg0.method6284();
        } else if (arg1 == 6) {
            arg0.method6272();
        } else if (arg1 == 7) {
            this.field1682 = arg0.method6353();
        } else if (arg1 == 8) {
            this.field1674 = arg0.method6353();
        } else if (arg1 == 11) {
            this.field1679 = arg0.method6284();
        } else if (arg1 == 14) {
            this.field1684 = arg0.method6272();
        } else if (arg1 == 15) {
            this.field1677 = arg0.method6272();
        }
    }

    @ObfuscatedName("fs.j(I)Lon;")
    public class414 method2716() {
        if (this.field1682 < 0) {
            return null;
        }
        class414 var1 = (class414) field1687.method4223((long) this.field1682);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method6113(Statics.field1673, this.field1682, 0);
        if (var2 != null) {
            field1687.method4225(var2, (long) this.field1682);
        }
        return var2;
    }

    @ObfuscatedName("fs.m(B)Lon;")
    public class414 method2727() {
        if (this.field1674 < 0) {
            return null;
        }
        class414 var1 = (class414) field1687.method4223((long) this.field1674);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method6113(Statics.field1673, this.field1674, 0);
        if (var2 != null) {
            field1687.method4225(var2, (long) this.field1674);
        }
        return var2;
    }
}
