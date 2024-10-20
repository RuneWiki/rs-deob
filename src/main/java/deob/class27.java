package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ag")
public class class27 {

    @ObfuscatedName("ag.m")
    public int field213 = -1;

    @ObfuscatedName("ag.f")
    public String field206;

    @ObfuscatedName("ag.q")
    public String field207;

    @ObfuscatedName("ag.w")
    public int field208 = -1;

    @ObfuscatedName("ag.o")
    public int field209 = -1;

    @ObfuscatedName("ag.u")
    public class225 field215 = null;

    @ObfuscatedName("ag.g")
    public int field211 = Integer.MAX_VALUE;

    @ObfuscatedName("ag.l")
    public int field212 = 0;

    @ObfuscatedName("ag.e")
    public int field218 = Integer.MAX_VALUE;

    @ObfuscatedName("ag.x")
    public int field214 = 0;

    @ObfuscatedName("ag.d")
    public boolean field210 = false;

    @ObfuscatedName("ag.k")
    public LinkedList field221;

    @ObfuscatedName("ag.m(Lgr;II)V")
    public void method324(class202 arg0, int arg1) {
        this.field213 = arg1;
        this.field206 = arg0.method3426();
        this.field207 = arg0.method3426();
        this.field215 = new class225(arg0.method3620());
        this.field208 = arg0.method3620();
        arg0.method3551();
        this.field210 = arg0.method3551() == 1;
        this.field209 = arg0.method3551();
        int var3 = arg0.method3551();
        this.field221 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field221.add(this.method346(arg0));
        }
        this.method301();
    }

    @ObfuscatedName("ag.f(Lgr;S)Lab;")
    public class38 method346(class202 arg0) {
        int var2 = arg0.method3551();
        class21[] var3 = new class21[] { class21.field134, class21.field136, class21.field133, class21.field143 };
        class21 var4 = (class21) class197.method999(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field137) {
            case 0:
                var6 = new class34();
                break;
            case 1:
                var6 = new class25();
                break;
            case 2:
                var6 = new class43();
                break;
            case 3:
                var6 = new class20();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var6).method208(arg0);
        return (class38) var6;
    }

    @ObfuscatedName("ag.q(IIII)Z")
    public boolean method297(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field221.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method205(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ag.w(III)Z")
    public boolean method298(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field211 || var3 > this.field212) {
            return false;
        } else if (var4 >= this.field218 && var4 <= this.field214) {
            Iterator var5 = this.field221.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method223(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.o(IIII)[I")
    public int[] method299(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field221.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method205(arg0, arg1, arg2));
        return var5.method209(arg0, arg1, arg2);
    }

    @ObfuscatedName("ag.u(III)Lhu;")
    public class225 method300(int arg0, int arg1) {
        Iterator var3 = this.field221.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method223(arg0, arg1));
        return var4.method207(arg0, arg1);
    }

    @ObfuscatedName("ag.g(B)V")
    public void method301() {
        Iterator var1 = this.field221.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method204(this);
        }
    }

    @ObfuscatedName("ag.l(I)I")
    public int method337() {
        return this.field213;
    }

    @ObfuscatedName("ag.e(B)Z")
    public boolean method303() {
        return this.field210;
    }

    @ObfuscatedName("ag.x(B)Ljava/lang/String;")
    public String method304() {
        return this.field206;
    }

    @ObfuscatedName("ag.d(B)Ljava/lang/String;")
    public String method364() {
        return this.field207;
    }

    @ObfuscatedName("ag.a(I)I")
    public int method296() {
        return this.field208;
    }

    @ObfuscatedName("ag.z(I)I")
    public int method307() {
        return this.field209;
    }

    @ObfuscatedName("ag.j(B)I")
    public int method308() {
        return this.field211;
    }

    @ObfuscatedName("ag.s(B)I")
    public int method295() {
        return this.field212;
    }

    @ObfuscatedName("ag.t(I)I")
    public int method310() {
        return this.field218;
    }

    @ObfuscatedName("ag.y(I)I")
    public int method311() {
        return this.field214;
    }

    @ObfuscatedName("ag.h(B)I")
    public int method309() {
        return this.field215.field2605;
    }

    @ObfuscatedName("ag.b(I)I")
    public int method313() {
        return this.field215.field2608;
    }

    @ObfuscatedName("ag.c(I)I")
    public int method314() {
        return this.field215.field2606;
    }

    @ObfuscatedName("ag.p(I)Lhu;")
    public class225 method336() {
        return new class225(this.field215);
    }
}
