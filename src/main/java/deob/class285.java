package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("kp")
public class class285 {

    @ObfuscatedName("kp.ap")
    public int field3110 = -1;

    @ObfuscatedName("kp.aw")
    public String field3112;

    @ObfuscatedName("kp.ak")
    public String field3120;

    @ObfuscatedName("kp.aj")
    public int field3111 = -1;

    @ObfuscatedName("kp.ai")
    public int field3108 = -16777216;

    @ObfuscatedName("kp.ay")
    public int field3121 = -1;

    @ObfuscatedName("kp.as")
    public class351 field3114 = null;

    @ObfuscatedName("kp.ae")
    public int field3113 = Integer.MAX_VALUE;

    @ObfuscatedName("kp.am")
    public int field3116 = 0;

    @ObfuscatedName("kp.at")
    public int field3117 = Integer.MAX_VALUE;

    @ObfuscatedName("kp.au")
    public int field3118 = 0;

    @ObfuscatedName("kp.an")
    public boolean field3119 = false;

    @ObfuscatedName("kp.ao")
    public LinkedList field3109;

    @ObfuscatedName("kp.ap(Lvl;II)V")
    public void method5502(class558 arg0, int arg1) {
        this.field3110 = arg1;
        this.field3112 = arg0.method9269();
        this.field3120 = arg0.method9269();
        this.field3114 = new class351(arg0.method9264());
        this.field3111 = arg0.method9264();
        this.field3108 = arg0.method9264();
        arg0.method9258();
        this.field3119 = arg0.method9258() == 1;
        this.field3121 = arg0.method9258();
        int var3 = arg0.method9258();
        this.field3109 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3109.add(this.method5559(arg0));
        }
        this.method5508();
    }

    @ObfuscatedName("kp.aw(Lvl;B)Llv;")
    public class305 method5559(class558 arg0) {
        int var2 = arg0.method9258();
        class293 var3 = (class293) class406.method3580(class293.method5772(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field3196) {
            case 0:
                var5 = new class292();
                break;
            case 1:
                var5 = new class284();
                break;
            case 2:
                var5 = new class302();
                break;
            case 3:
                var5 = new class289();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class305) var5).method5479(arg0);
        return (class305) var5;
    }

    @ObfuscatedName("kp.ak(IIII)Z")
    public boolean method5504(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3109.iterator();
        class305 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class305) var4.next();
        } while (!var5.method5478(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("kp.aj(IIB)Z")
    public boolean method5553(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field3113 || var3 > this.field3116) {
            return false;
        } else if (var4 >= this.field3117 && var4 <= this.field3118) {
            Iterator var5 = this.field3109.iterator();
            class305 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class305) var5.next();
            } while (!var6.method5476(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kp.ai(IIII)[I")
    public int[] method5506(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3109.iterator();
        class305 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class305) var4.next();
        } while (!var5.method5478(arg0, arg1, arg2));
        return var5.method5477(arg0, arg1, arg2);
    }

    @ObfuscatedName("kp.ay(III)Lnn;")
    public class351 method5561(int arg0, int arg1) {
        Iterator var3 = this.field3109.iterator();
        class305 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class305) var3.next();
        } while (!var4.method5476(arg0, arg1));
        return var4.method5499(arg0, arg1);
    }

    @ObfuscatedName("kp.as(I)V")
    public void method5508() {
        Iterator var1 = this.field3109.iterator();
        while (var1.hasNext()) {
            class305 var2 = (class305) var1.next();
            var2.method5490(this);
        }
    }

    @ObfuscatedName("kp.ae(S)I")
    public int method5509() {
        return this.field3110;
    }

    @ObfuscatedName("kp.am(I)Z")
    public boolean method5510() {
        return this.field3119;
    }

    @ObfuscatedName("kp.at(I)Ljava/lang/String;")
    public String method5538() {
        return this.field3112;
    }

    @ObfuscatedName("kp.au(I)Ljava/lang/String;")
    public String method5505() {
        return this.field3120;
    }

    @ObfuscatedName("kp.an(B)I")
    public int method5513() {
        return this.field3111;
    }

    @ObfuscatedName("kp.ao(I)I")
    public int method5518() {
        return this.field3108;
    }

    @ObfuscatedName("kp.af(I)I")
    public int method5515() {
        return this.field3121;
    }

    @ObfuscatedName("kp.ar(B)I")
    public int method5516() {
        return this.field3113;
    }

    @ObfuscatedName("kp.ab(B)I")
    public int method5517() {
        return this.field3116;
    }

    @ObfuscatedName("kp.az(B)I")
    public int method5512() {
        return this.field3117;
    }

    @ObfuscatedName("kp.ag(I)I")
    public int method5519() {
        return this.field3118;
    }

    @ObfuscatedName("kp.ad(I)I")
    public int method5564() {
        return this.field3114.field3777;
    }

    @ObfuscatedName("kp.ac(I)I")
    public int method5521() {
        return this.field3114.field3779;
    }

    @ObfuscatedName("kp.av(I)I")
    public int method5522() {
        return this.field3114.field3778;
    }

    @ObfuscatedName("kp.ax(B)Lnn;")
    public class351 method5546() {
        return new class351(this.field3114);
    }
}
