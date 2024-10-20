package deob;

@ObfuscatedName("fb")
public final class class75 {

    @ObfuscatedName("fb.b")
    public int field1074;

    @ObfuscatedName("fb.c")
    public int field1072;

    @ObfuscatedName("fb.m")
    public class18 field1076 = new class18();

    @ObfuscatedName("fb.i")
    public class3 field1075;

    @ObfuscatedName("fb.v")
    public class7 field1073 = new class7();

    @ObfuscatedName("fb.b(Lfk;J)V")
    public void method1184(class7 arg0, long arg1) {
        if (this.field1074 == 0) {
            class7 var4 = this.field1076.method171();
            var4.method76();
            var4.method49();
            if (this.field1073 == var4) {
                class7 var5 = this.field1076.method171();
                var5.method76();
                var5.method49();
            }
        } else {
            this.field1074--;
        }
        this.field1075.method9(arg0, arg1);
        this.field1076.method175(arg0);
    }

    @ObfuscatedName("fb.c(J)V")
    public void method1187(long arg0) {
        class7 var3 = (class7) this.field1075.method8(arg0);
        if (var3 != null) {
            var3.method76();
            var3.method49();
            this.field1074++;
        }
    }

    @ObfuscatedName("fb.i()V")
    public void method1188() {
        this.field1076.method174();
        this.field1075.method10();
        this.field1073 = new class7();
        this.field1074 = this.field1072;
    }

    public class75(int arg0) {
        this.field1072 = arg0;
        this.field1074 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1075 = new class3(var2);
    }

    @ObfuscatedName("fb.v(J)Lfk;")
    public class7 method1196(long arg0) {
        class7 var3 = (class7) this.field1075.method8(arg0);
        if (var3 != null) {
            this.field1076.method175(var3);
        }
        return var3;
    }
}
