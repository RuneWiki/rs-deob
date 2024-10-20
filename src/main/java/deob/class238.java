package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("it")
public class class238 {

    @ObfuscatedName("it.h")
    public int field2863 = -1;

    @ObfuscatedName("it.e")
    public String field2851;

    @ObfuscatedName("it.v")
    public String field2862;

    @ObfuscatedName("it.x")
    public int field2858 = -1;

    @ObfuscatedName("it.m")
    public int field2854 = -1;

    @ObfuscatedName("it.q")
    public class297 field2855 = null;

    @ObfuscatedName("it.f")
    public int field2856 = Integer.MAX_VALUE;

    @ObfuscatedName("it.r")
    public int field2857 = 0;

    @ObfuscatedName("it.u")
    public int field2852 = Integer.MAX_VALUE;

    @ObfuscatedName("it.b")
    public int field2859 = 0;

    @ObfuscatedName("it.j")
    public boolean field2860 = false;

    @ObfuscatedName("it.g")
    public LinkedList field2861;

    @ObfuscatedName("it.h(Lqy;IB)V")
    public void method4502(class467 arg0, int arg1) {
        this.field2863 = arg1;
        this.field2851 = arg0.method7801();
        this.field2862 = arg0.method7801();
        this.field2855 = new class297(arg0.method7946());
        this.field2858 = arg0.method7946();
        arg0.method7792();
        this.field2860 = arg0.method7792() == 1;
        this.field2854 = arg0.method7792();
        int var3 = arg0.method7792();
        this.field2861 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2861.add(this.method4503(arg0));
        }
        this.method4508();
    }

    @ObfuscatedName("it.e(Lqy;I)Liw;")
    public class258 method4503(class467 arg0) {
        int var2 = arg0.method7792();
        class246[] var3 = new class246[] { class246.field2940, class246.field2934, class246.field2936, class246.field2935 };
        class246 var4 = (class246) class347.method1688(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2938) {
            case 0:
                var6 = new class245();
                break;
            case 1:
                var6 = new class242();
                break;
            case 2:
                var6 = new class237();
                break;
            case 3:
                var6 = new class255();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class258) var6).method4480(arg0);
        return (class258) var6;
    }

    @ObfuscatedName("it.v(IIIB)Z")
    public boolean method4548(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2861.iterator();
        class258 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class258) var4.next();
        } while (!var5.method4476(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("it.x(III)Z")
    public boolean method4510(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2856 || var3 > this.field2857) {
            return false;
        } else if (var4 >= this.field2852 && var4 <= this.field2859) {
            Iterator var5 = this.field2861.iterator();
            class258 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class258) var5.next();
            } while (!var6.method4477(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("it.m(IIII)[I")
    public int[] method4539(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2861.iterator();
        class258 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class258) var4.next();
        } while (!var5.method4476(arg0, arg1, arg2));
        return var5.method4478(arg0, arg1, arg2);
    }

    @ObfuscatedName("it.q(IIB)Lky;")
    public class297 method4507(int arg0, int arg1) {
        Iterator var3 = this.field2861.iterator();
        class258 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class258) var3.next();
        } while (!var4.method4477(arg0, arg1));
        return var4.method4479(arg0, arg1);
    }

    @ObfuscatedName("it.f(I)V")
    public void method4508() {
        Iterator var1 = this.field2861.iterator();
        while (var1.hasNext()) {
            class258 var2 = (class258) var1.next();
            var2.method4475(this);
        }
    }

    @ObfuscatedName("it.r(I)I")
    public int method4509() {
        return this.field2863;
    }

    @ObfuscatedName("it.u(I)Z")
    public boolean method4540() {
        return this.field2860;
    }

    @ObfuscatedName("it.b(I)Ljava/lang/String;")
    public String method4511() {
        return this.field2851;
    }

    @ObfuscatedName("it.j(B)Ljava/lang/String;")
    public String method4541() {
        return this.field2862;
    }

    @ObfuscatedName("it.g(B)I")
    public int method4520() {
        return this.field2858;
    }

    @ObfuscatedName("it.i(I)I")
    public int method4514() {
        return this.field2854;
    }

    @ObfuscatedName("it.o(B)I")
    public int method4527() {
        return this.field2856;
    }

    @ObfuscatedName("it.n(B)I")
    public int method4516() {
        return this.field2857;
    }

    @ObfuscatedName("it.k(I)I")
    public int method4517() {
        return this.field2852;
    }

    @ObfuscatedName("it.a(I)I")
    public int method4518() {
        return this.field2859;
    }

    @ObfuscatedName("it.s(I)I")
    public int method4519() {
        return this.field2855.field3451;
    }

    @ObfuscatedName("it.l(B)I")
    public int method4561() {
        return this.field2855.field3450;
    }

    @ObfuscatedName("it.t(B)I")
    public int method4521() {
        return this.field2855.field3452;
    }

    @ObfuscatedName("it.c(I)Lky;")
    public class297 method4512() {
        return new class297(this.field2855);
    }
}
