package deob;

@ObfuscatedName("rf")
public class class468 implements class353 {

    @ObfuscatedName("rf.aj")
    public static final class468 field4867 = new class468(0, 0, Integer.class, new class465());

    @ObfuscatedName("rf.al")
    public static final class468 field4860 = new class468(1, 1, Long.class, new class467());

    @ObfuscatedName("rf.ac")
    public static final class468 field4866 = new class468(2, 2, String.class, new class469());

    @ObfuscatedName("rf.ab")
    public final int field4862;

    @ObfuscatedName("rf.an")
    public final int field4863;

    @ObfuscatedName("rf.ao")
    public final Class field4859;

    @ObfuscatedName("rf.av")
    public final class464 field4865;

    @ObfuscatedName("rf.ab(B)[Lrf;")
    public static class468[] method7769() {
        return new class468[] { field4867, field4866, field4860 };
    }

    public class468(int arg0, int arg1, Class arg2, class464 arg3) {
        this.field4862 = arg0;
        this.field4863 = arg1;
        this.field4859 = arg2;
        this.field4865 = arg3;
    }

    @ObfuscatedName("rf.an(Ljava/lang/Class;B)Lrf;")
    public static class468 method7762(Class arg0) {
        class468[] var1 = method7769();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class468 var3 = var1[var2];
            if (var3.field4859 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("rf.ao(Ljava/lang/Object;Lsy;B)V")
    public static void method7764(Object arg0, class478 arg1) {
        class464 var2 = method7760(arg0.getClass());
        var2.method7740(arg0, arg1);
    }

    @ObfuscatedName("rf.av(Ljava/lang/Class;B)Lrj;")
    public static class464 method7760(Class arg0) {
        class468[] var1 = method7769();
        int var2 = 0;
        class468 var4;
        while (true) {
            if (var2 >= var1.length) {
                var4 = null;
                break;
            }
            class468 var3 = var1[var2];
            if (var3.field4859 == arg0) {
                var4 = var3;
                break;
            }
            var2++;
        }
        if (var4 == null) {
            throw new IllegalArgumentException();
        }
        return var4.field4865;
    }

    @ObfuscatedName("rf.aj(I)I")
    public int method33() {
        return this.field4863;
    }

    @ObfuscatedName("rf.aq(Lsy;I)Ljava/lang/Object;")
    public Object method7756(class478 arg0) {
        return this.field4865.method7738(arg0);
    }
}
