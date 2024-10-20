package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ag")
public class class27 {

    @ObfuscatedName("ag.c")
    public int field213 = -1;

    @ObfuscatedName("ag.x")
    public String field207;

    @ObfuscatedName("ag.t")
    public String field219;

    @ObfuscatedName("ag.g")
    public int field209 = -1;

    @ObfuscatedName("ag.l")
    public int field206 = -1;

    @ObfuscatedName("ag.u")
    public class214 field211 = null;

    @ObfuscatedName("ag.j")
    public int field220 = Integer.MAX_VALUE;

    @ObfuscatedName("ag.v")
    public int field217 = 0;

    @ObfuscatedName("ag.d")
    public int field214 = Integer.MAX_VALUE;

    @ObfuscatedName("ag.z")
    public int field215 = 0;

    @ObfuscatedName("ag.n")
    public boolean field216 = false;

    @ObfuscatedName("ag.h")
    public LinkedList field208;

    @ObfuscatedName("ag.c(Lkz;II)V")
    public void method283(class300 arg0, int arg1) {
        this.field213 = arg1;
        this.field207 = arg0.method5112();
        this.field219 = arg0.method5112();
        this.field211 = new class214(arg0.method5208());
        this.field209 = arg0.method5208();
        arg0.method5103();
        this.field216 = arg0.method5103() == 1;
        this.field206 = arg0.method5103();
        int var3 = arg0.method5103();
        this.field208 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field208.add(this.method250(arg0));
        }
        this.method255();
    }

    @ObfuscatedName("ag.x(Lkz;B)Lab;")
    public class38 method250(class300 arg0) {
        int var2 = arg0.method5103();
        class21[] var3 = new class21[] { class21.field150, class21.field152, class21.field148, class21.field151 };
        class21 var4 = (class21) class196.method3332(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field147) {
            case 0:
                var6 = new class34();
                break;
            case 1:
                var6 = new class43();
                break;
            case 2:
                var6 = new class25();
                break;
            case 3:
                var6 = new class20();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var6).method189(arg0);
        return (class38) var6;
    }

    @ObfuscatedName("ag.t(IIII)Z")
    public boolean method251(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field208.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method187(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ag.g(III)Z")
    public boolean method249(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field220 || var3 > this.field217) {
            return false;
        } else if (var4 >= this.field214 && var4 <= this.field215) {
            Iterator var5 = this.field208.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method204(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.l(IIIB)[I")
    public int[] method253(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field208.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method187(arg0, arg1, arg2));
        return var5.method198(arg0, arg1, arg2);
    }

    @ObfuscatedName("ag.u(IIB)Lhj;")
    public class214 method254(int arg0, int arg1) {
        Iterator var3 = this.field208.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method204(arg0, arg1));
        return var4.method188(arg0, arg1);
    }

    @ObfuscatedName("ag.j(I)V")
    public void method255() {
        Iterator var1 = this.field208.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method185(this);
        }
    }

    @ObfuscatedName("ag.v(B)I")
    public int method315() {
        return this.field213;
    }

    @ObfuscatedName("ag.d(B)Z")
    public boolean method257() {
        return this.field216;
    }

    @ObfuscatedName("ag.z(I)Ljava/lang/String;")
    public String method258() {
        return this.field207;
    }

    @ObfuscatedName("ag.s(B)Ljava/lang/String;")
    public String method282() {
        return this.field219;
    }

    @ObfuscatedName("ag.p(I)I")
    public int method260() {
        return this.field209;
    }

    @ObfuscatedName("ag.e(I)I")
    public int method261() {
        return this.field206;
    }

    @ObfuscatedName("ag.i(I)I")
    public int method262() {
        return this.field220;
    }

    @ObfuscatedName("ag.q(S)I")
    public int method263() {
        return this.field217;
    }

    @ObfuscatedName("ag.r(I)I")
    public int method304() {
        return this.field214;
    }

    @ObfuscatedName("ag.k(I)I")
    public int method289() {
        return this.field215;
    }

    @ObfuscatedName("ag.w(B)I")
    public int method317() {
        return this.field211.field2502;
    }

    @ObfuscatedName("ag.m(I)I")
    public int method266() {
        return this.field211.field2501;
    }

    @ObfuscatedName("ag.o(I)I")
    public int method267() {
        return this.field211.field2503;
    }

    @ObfuscatedName("ag.a(I)Lhj;")
    public class214 method268() {
        return new class214(this.field211);
    }
}
