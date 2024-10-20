package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("aa")
public class class27 {

    @ObfuscatedName("aa.a")
    public int field204 = -1;

    @ObfuscatedName("aa.t")
    public String field202;

    @ObfuscatedName("aa.n")
    public String field203;

    @ObfuscatedName("aa.q")
    public int field201 = -1;

    @ObfuscatedName("aa.v")
    public int field205 = -1;

    @ObfuscatedName("aa.l")
    public class214 field206 = null;

    @ObfuscatedName("aa.c")
    public int field209 = Integer.MAX_VALUE;

    @ObfuscatedName("aa.o")
    public int field208 = 0;

    @ObfuscatedName("aa.i")
    public int field211 = Integer.MAX_VALUE;

    @ObfuscatedName("aa.d")
    public int field210 = 0;

    @ObfuscatedName("aa.m")
    public boolean field213 = false;

    @ObfuscatedName("aa.p")
    public LinkedList field212;

    @ObfuscatedName("aa.a(Lkc;II)V")
    public void method344(class300 arg0, int arg1) {
        this.field204 = arg1;
        this.field202 = arg0.method5132();
        this.field203 = arg0.method5132();
        this.field206 = new class214(arg0.method5155());
        this.field201 = arg0.method5155();
        arg0.method5123();
        this.field213 = arg0.method5123() == 1;
        this.field205 = arg0.method5123();
        int var3 = arg0.method5123();
        this.field212 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field212.add(this.method313(arg0));
        }
        this.method349();
    }

    @ObfuscatedName("aa.t(Lkc;I)Lal;")
    public class38 method313(class300 arg0) {
        int var2 = arg0.method5123();
        class21[] var3 = new class21[] { class21.field142, class21.field139, class21.field146, class21.field137 };
        class21 var4 = (class21) class196.method292(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field140) {
            case 0:
                var6 = new class43();
                break;
            case 1:
                var6 = new class34();
                break;
            case 2:
                var6 = new class20();
                break;
            case 3:
                var6 = new class25();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var6).method229(arg0);
        return (class38) var6;
    }

    @ObfuscatedName("aa.n(IIII)Z")
    public boolean method314(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field212.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method225(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("aa.q(III)Z")
    public boolean method326(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field209 || var3 > this.field208) {
            return false;
        } else if (var4 >= this.field211 && var4 <= this.field210) {
            Iterator var5 = this.field212.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method226(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.v(IIIB)[I")
    public int[] method316(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field212.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method225(arg0, arg1, arg2));
        return var5.method233(arg0, arg1, arg2);
    }

    @ObfuscatedName("aa.l(III)Lhf;")
    public class214 method380(int arg0, int arg1) {
        Iterator var3 = this.field212.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method226(arg0, arg1));
        return var4.method227(arg0, arg1);
    }

    @ObfuscatedName("aa.c(I)V")
    public void method349() {
        Iterator var1 = this.field212.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method248(this);
        }
    }

    @ObfuscatedName("aa.o(B)I")
    public int method354() {
        return this.field204;
    }

    @ObfuscatedName("aa.i(B)Z")
    public boolean method320() {
        return this.field213;
    }

    @ObfuscatedName("aa.d(B)Ljava/lang/String;")
    public String method315() {
        return this.field202;
    }

    @ObfuscatedName("aa.m(I)Ljava/lang/String;")
    public String method322() {
        return this.field203;
    }

    @ObfuscatedName("aa.p(I)I")
    public int method323() {
        return this.field201;
    }

    @ObfuscatedName("aa.h(I)I")
    public int method312() {
        return this.field205;
    }

    @ObfuscatedName("aa.k(I)I")
    public int method325() {
        return this.field209;
    }

    @ObfuscatedName("aa.x(I)I")
    public int method311() {
        return this.field208;
    }

    @ObfuscatedName("aa.j(I)I")
    public int method327() {
        return this.field211;
    }

    @ObfuscatedName("aa.r(I)I")
    public int method370() {
        return this.field210;
    }

    @ObfuscatedName("aa.e(I)I")
    public int method329() {
        return this.field206.field2512;
    }

    @ObfuscatedName("aa.s(B)I")
    public int method330() {
        return this.field206.field2509;
    }

    @ObfuscatedName("aa.b(B)I")
    public int method359() {
        return this.field206.field2510;
    }

    @ObfuscatedName("aa.w(I)Lhf;")
    public class214 method332() {
        return new class214(this.field206);
    }
}
