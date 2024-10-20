package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("kp")
public class class308 {

    @ObfuscatedName("kp.o")
    public class373 field3507 = new class373();

    @ObfuscatedName("kp.u")
    public class373 field3524 = new class373();

    @ObfuscatedName("kp.x")
    public boolean field3509 = false;

    @ObfuscatedName("kp.a")
    public boolean field3510 = true;

    @ObfuscatedName("kp.q")
    public int field3511 = 0;

    @ObfuscatedName("kp.d")
    public boolean field3512 = false;

    @ObfuscatedName("kp.e")
    public int field3513 = 0;

    @ObfuscatedName("kp.g")
    public int field3515 = 0;

    @ObfuscatedName("kp.y")
    public int field3508 = 0;

    @ObfuscatedName("kp.af")
    public int field3516 = 0;

    @ObfuscatedName("kp.aa")
    public int field3517 = 0;

    @ObfuscatedName("kp.ai")
    public int field3518 = 0;

    @ObfuscatedName("kp.ag")
    public int field3519 = 0;

    @ObfuscatedName("kp.aw")
    public int field3520 = Integer.MAX_VALUE;

    @ObfuscatedName("kp.ar")
    public int field3521 = Integer.MAX_VALUE;

    @ObfuscatedName("kp.al")
    public int field3522 = Integer.MAX_VALUE;

    @ObfuscatedName("kp.at")
    public int field3523 = 0;

    @ObfuscatedName("kp.aj")
    public int field3528 = 0;

    @ObfuscatedName("kp.ax")
    public int field3497 = 0;

    @ObfuscatedName("kp.az")
    public int field3526 = 0;

    @ObfuscatedName("kp.ap")
    public class302 field3501;

    @ObfuscatedName("kp.ay")
    public class302 field3498;

    public class308() {
        this.field3507.method6536(1);
        this.field3524.method6536(1);
    }

    @ObfuscatedName("kp.f(I)V")
    public void method5392() {
        this.field3511 = (this.field3511 + 1) % 60;
        if (this.field3519 > 0) {
            this.field3519--;
        }
    }

    @ObfuscatedName("kp.w(ZB)Z")
    public boolean method5527(boolean arg0) {
        boolean var2 = arg0 && this.field3510;
        boolean var3 = this.field3509 != var2;
        this.field3509 = var2;
        if (!this.field3509) {
            this.method5483(this.field3516, this.field3516);
        }
        return var3;
    }

    @ObfuscatedName("kp.v(ZI)V")
    public void method5394(boolean arg0) {
        this.field3510 = arg0;
        this.field3509 = arg0 && this.field3509;
    }

    @ObfuscatedName("kp.s(Ljava/lang/String;I)Z")
    public boolean method5416(String arg0) {
        String var2 = this.field3507.method6513();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5460(arg0);
        this.field3507.method6523(var3);
        this.method5402(this.field3497, this.field3526);
        this.method5464();
        this.method5469();
        return true;
    }

    @ObfuscatedName("kp.z(Ljava/lang/String;I)Z")
    public boolean method5396(String arg0) {
        this.field3524.method6523(arg0);
        return true;
    }

    @ObfuscatedName("kp.j(Lnw;B)Z")
    public boolean method5503(class376 arg0) {
        boolean var2 = !this.field3512;
        this.field3507.method6524(arg0);
        this.field3524.method6524(arg0);
        this.field3512 = true;
        boolean var3 = var2 | this.method5402(this.field3497, this.field3526);
        boolean var4 = var3 | this.method5483(this.field3517, this.field3516);
        if (this.method5464()) {
            this.method5469();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("kp.i(IIB)Z")
    public boolean method5398(int arg0, int arg1) {
        boolean var3 = this.field3523 != arg0 || this.field3528 != arg1;
        this.field3523 = arg0;
        this.field3528 = arg1;
        return var3 | this.method5402(this.field3497, this.field3526);
    }

    @ObfuscatedName("kp.n(IB)Z")
    public boolean method5399(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3507.method6534();
        this.field3507.method6514(arg0, true);
        this.field3524.method6514(arg0, true);
        if (this.method5464()) {
            this.method5469();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("kp.l(II)Z")
    public boolean method5400(int arg0) {
        if (arg0 < 0) {
            this.field3520 = Integer.MAX_VALUE;
        } else {
            this.field3520 = arg0;
        }
        if (this.method5464()) {
            this.method5469();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kp.k(IB)Z")
    public boolean method5620(int arg0) {
        this.field3522 = arg0;
        if (this.method5464()) {
            this.method5469();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kp.c(III)Z")
    public boolean method5402(int arg0, int arg1) {
        if (!this.method5449()) {
            this.field3497 = arg0;
            this.field3526 = arg1;
            return false;
        }
        int var3 = this.field3497;
        int var4 = this.field3526;
        int var5 = Math.max(0, this.field3507.method6610() - this.field3523 + 2);
        int var6 = Math.max(0, this.field3507.method6530() - this.field3528 + 1);
        this.field3497 = Math.max(0, Math.min(var5, arg0));
        this.field3526 = Math.max(0, Math.min(var6, arg1));
        return this.field3497 != var3 || this.field3526 != var4;
    }

    @ObfuscatedName("kp.r(IIB)Z")
    public boolean method5538(int arg0, int arg1) {
        return true;
    }

    @ObfuscatedName("kp.b(II)V")
    public void method5404(int arg0) {
        this.field3507.method6518(arg0);
    }

    @ObfuscatedName("kp.m(II)V")
    public void method5405(int arg0) {
        this.field3513 = arg0;
    }

    @ObfuscatedName("kp.t(II)V")
    public void method5406(int arg0) {
        this.field3507.method6536(arg0);
    }

    @ObfuscatedName("kp.h(II)V")
    public void method5407(int arg0) {
        this.field3507.method6515(arg0);
    }

    @ObfuscatedName("kp.p(IB)Z")
    public boolean method5408(int arg0) {
        this.field3508 = arg0;
        String var2 = this.field3507.method6513();
        int var3 = var2.length();
        String var4 = this.method5460(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3507.method6523(var4);
        this.method5402(this.field3497, this.field3526);
        this.method5464();
        this.method5469();
        return true;
    }

    @ObfuscatedName("kp.o(B)V")
    public void method5501() {
        this.field3512 = false;
    }

    @ObfuscatedName("kp.u(II)Z")
    public boolean method5410(int arg0) {
        if (this.method5470(arg0)) {
            this.method5415();
            class374 var2 = this.field3507.method6609((char) arg0, this.field3516, this.field3521, this.field3520);
            this.method5483(var2.method6621(), var2.method6621());
            this.method5464();
            this.method5469();
        }
        return true;
    }

    @ObfuscatedName("kp.x(B)V")
    public void method5411() {
        if (!this.method5415() && this.field3516 > 0) {
            int var1 = this.field3507.method6587(this.field3516 - 1);
            this.method5469();
            this.method5483(var1, var1);
        }
    }

    @ObfuscatedName("kp.a(I)V")
    public void method5594() {
        if (!this.method5415() && this.field3516 < this.field3507.method6608()) {
            int var1 = this.field3507.method6587(this.field3516);
            this.method5469();
            this.method5483(var1, var1);
        }
    }

    @ObfuscatedName("kp.q(I)V")
    public void method5413() {
        if (!this.method5415() && this.field3516 > 0) {
            class448 var1 = this.method5462(this.field3516 - 1);
            int var2 = this.field3507.method6526((Integer) var1.field4833, this.field3516);
            this.method5469();
            this.method5483(var2, var2);
        }
    }

    @ObfuscatedName("kp.d(I)V")
    public void method5414() {
        if (!this.method5415() && this.field3516 < this.field3507.method6608()) {
            class448 var1 = this.method5462(this.field3516);
            int var2 = this.field3507.method6526(this.field3516, (Integer) var1.field4834);
            this.method5469();
            this.method5483(var2, var2);
        }
    }

    @ObfuscatedName("kp.e(I)Z")
    public boolean method5415() {
        if (this.method5557()) {
            int var1 = this.field3507.method6526(this.field3517, this.field3516);
            this.method5469();
            this.method5483(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kp.g(B)V")
    public void method5461() {
        this.method5483(0, this.field3507.method6608());
    }

    @ObfuscatedName("kp.y(III)Z")
    public boolean method5483(int arg0, int arg1) {
        if (!this.method5449()) {
            this.field3517 = arg0;
            this.field3516 = arg1;
            return false;
        }
        if (arg0 > this.field3507.method6608()) {
            arg0 = this.field3507.method6608();
        }
        if (arg1 > this.field3507.method6608()) {
            arg1 = this.field3507.method6608();
        }
        boolean var3 = this.field3517 != arg0 || this.field3516 != arg1;
        this.field3517 = arg0;
        if (this.field3516 != arg1) {
            this.field3516 = arg1;
            this.field3511 = 0;
            this.method5467();
        }
        if (var3 && this.field3498 != null) {
            this.field3498.method2591();
        }
        return var3;
    }

    @ObfuscatedName("kp.af(ZI)V")
    public void method5393(boolean arg0) {
        class448 var2 = this.method5463(this.field3516);
        this.method5452((Integer) var2.field4833, arg0);
    }

    @ObfuscatedName("kp.aa(ZI)V")
    public void method5530(boolean arg0) {
        class448 var2 = this.method5463(this.field3516);
        this.method5452((Integer) var2.field4834, arg0);
    }

    @ObfuscatedName("kp.ai(ZI)V")
    public void method5602(boolean arg0) {
        this.method5452(0, arg0);
    }

    @ObfuscatedName("kp.ag(ZI)V")
    public void method5630(boolean arg0) {
        this.method5452(this.field3507.method6608(), arg0);
    }

    @ObfuscatedName("kp.aw(ZB)V")
    public void method5507(boolean arg0) {
        if (this.method5557() && !arg0) {
            this.method5452(Math.min(this.field3517, this.field3516), arg0);
        } else if (this.field3516 > 0) {
            this.method5452(this.field3516 - 1, arg0);
        }
    }

    @ObfuscatedName("kp.ar(ZI)V")
    public void method5423(boolean arg0) {
        if (this.method5557() && !arg0) {
            this.method5452(Math.max(this.field3517, this.field3516), arg0);
        } else if (this.field3516 < this.field3507.method6608()) {
            this.method5452(this.field3516 + 1, arg0);
        }
    }

    @ObfuscatedName("kp.al(ZI)V")
    public void method5633(boolean arg0) {
        if (this.field3516 > 0) {
            class448 var2 = this.method5462(this.field3516 - 1);
            this.method5452((Integer) var2.field4833, arg0);
        }
    }

    @ObfuscatedName("kp.at(ZI)V")
    public void method5425(boolean arg0) {
        if (this.field3516 < this.field3507.method6608()) {
            class448 var2 = this.method5462(this.field3516 + 1);
            this.method5452((Integer) var2.field4834, arg0);
        }
    }

    @ObfuscatedName("kp.aj(ZI)V")
    public void method5426(boolean arg0) {
        if (this.field3516 > 0) {
            this.method5452(this.field3507.method6550(this.field3516, -1), arg0);
        }
    }

    @ObfuscatedName("kp.ax(ZI)V")
    public void method5427(boolean arg0) {
        if (this.field3516 < this.field3507.method6608()) {
            this.method5452(this.field3507.method6550(this.field3516, 1), arg0);
        }
    }

    @ObfuscatedName("kp.az(ZB)V")
    public void method5428(boolean arg0) {
        if (this.field3516 > 0) {
            int var2 = this.method5656();
            this.method5452(this.field3507.method6550(this.field3516, -var2), arg0);
        }
    }

    @ObfuscatedName("kp.ap(ZB)V")
    public void method5429(boolean arg0) {
        if (this.field3516 < this.field3507.method6608()) {
            int var2 = this.method5656();
            this.method5452(this.field3507.method6550(this.field3516, var2), arg0);
        }
    }

    @ObfuscatedName("kp.ay(ZI)V")
    public void method5430(boolean arg0) {
        class377 var2 = this.field3507.method6575(0, this.field3516);
        class448 var3 = var2.method6732();
        this.method5452(this.field3507.method6527((Integer) var3.field4833, this.field3526), arg0);
    }

    @ObfuscatedName("kp.ac(ZB)V")
    public void method5431(boolean arg0) {
        class377 var2 = this.field3507.method6575(0, this.field3516);
        class448 var3 = var2.method6732();
        this.method5452(this.field3507.method6527((Integer) var3.field4833, this.field3528 + this.field3526), arg0);
    }

    @ObfuscatedName("kp.av(IIZZI)V")
    public void method5432(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3512) {
            int var7 = this.field3497 + arg0;
            int var8 = this.field3526 + arg1;
            var6 = this.field3507.method6527(var7, var8);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3515 = 1;
            class448 var9 = this.method5462(var6);
            class448 var10 = this.method5462(this.field3518);
            this.method5521(var10, var9);
        } else if (arg2) {
            this.field3515 = 1;
            class448 var11 = this.method5462(var6);
            this.method5483((Integer) var11.field4833, (Integer) var11.field4834);
            this.field3518 = (Integer) var11.field4833;
        } else if (arg3) {
            this.method5483(this.field3518, var6);
        } else {
            if (this.field3519 <= 0 || this.field3518 != var6) {
                this.field3515 = 0;
                this.method5483(var6, var6);
                this.field3518 = var6;
            } else if (this.field3517 == this.field3516) {
                this.field3515 = 1;
                class448 var12 = this.method5462(var6);
                this.method5483((Integer) var12.field4833, (Integer) var12.field4834);
            } else {
                this.field3515 = 2;
                class448 var13 = this.method5463(var6);
                this.method5483((Integer) var13.field4833, (Integer) var13.field4834);
            }
            this.field3519 = 25;
        }
    }

    @ObfuscatedName("kp.aq(IIB)V")
    public void method5518(int arg0, int arg1) {
        if (!this.field3512 || !this.method5444()) {
            return;
        }
        int var3 = this.field3497 + arg0;
        int var4 = this.field3526 + arg1;
        int var5 = this.field3507.method6527(var3, var4);
        switch(this.field3515) {
            case 0:
                this.method5483(this.field3517, var5);
                break;
            case 1:
                class448 var8 = this.method5462(this.field3518);
                class448 var9 = this.method5462(var5);
                this.method5521(var8, var9);
                break;
            case 2:
                class448 var6 = this.method5463(this.field3518);
                class448 var7 = this.method5463(var5);
                this.method5521(var6, var7);
        }
    }

    @ObfuscatedName("kp.ak(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5434(Clipboard arg0) {
        class377 var2 = this.field3507.method6575(this.field3517, this.field3516);
        if (!var2.method6726()) {
            String var3 = var2.method6736();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("kp.au(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5435(Clipboard arg0) {
        if (this.method5557()) {
            this.method5434(arg0);
            this.method5415();
        }
    }

    @ObfuscatedName("kp.ae(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5513(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5460((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5415();
            class374 var4 = this.field3507.method6521(var3, this.field3516, this.field3521, this.field3520);
            this.method5483(var4.method6621(), var4.method6621());
            this.method5464();
            this.method5469();
        } catch (Exception var6) {
            System.out.println("Error pasting clipboard to InputField.");
        }
    }

    @ObfuscatedName("kp.ah(I)V")
    public void method5437() {
        this.field3526 = Math.max(0, this.field3526 - this.field3507.method6531());
    }

    @ObfuscatedName("kp.ad(I)V")
    public void method5438() {
        int var1 = Math.max(0, this.field3507.method6530() - this.field3528);
        this.field3526 = Math.min(var1, this.field3526 + this.field3507.method6531());
    }

    @ObfuscatedName("kp.ab(Lkm;I)V")
    public void method5439(class302 arg0) {
        this.field3501 = arg0;
    }

    @ObfuscatedName("kp.an(Lkm;I)V")
    public void method5440(class302 arg0) {
        this.field3498 = arg0;
    }

    @ObfuscatedName("kp.am(I)Lnp;")
    public class373 method5441() {
        return this.field3507;
    }

    @ObfuscatedName("kp.as(I)Lnp;")
    public class373 method5598() {
        return this.field3524;
    }

    @ObfuscatedName("kp.ao(B)Lnm;")
    public class377 method5443() {
        return this.field3507.method6575(this.field3517, this.field3516);
    }

    @ObfuscatedName("kp.bj(I)Z")
    public boolean method5444() {
        return this.field3509;
    }

    @ObfuscatedName("kp.bf(I)Z")
    public boolean method5424() {
        return this.field3510;
    }

    @ObfuscatedName("kp.bz(B)Z")
    public boolean method5446() {
        return this.method5444() && this.field3511 % 60 < 30;
    }

    @ObfuscatedName("kp.br(I)I")
    public int method5615() {
        return this.field3516;
    }

    @ObfuscatedName("kp.bm(I)I")
    public int method5448() {
        return this.field3517;
    }

    @ObfuscatedName("kp.be(I)Z")
    public boolean method5449() {
        return this.field3512;
    }

    @ObfuscatedName("kp.bo(I)I")
    public int method5450() {
        return this.field3497;
    }

    @ObfuscatedName("kp.bl(S)I")
    public int method5511() {
        return this.field3526;
    }

    @ObfuscatedName("kp.bq(I)I")
    public int method5420() {
        return this.field3507.method6534();
    }

    @ObfuscatedName("kp.bn(I)I")
    public int method5453() {
        return this.field3520;
    }

    @ObfuscatedName("kp.bi(I)I")
    public int method5454() {
        return this.field3522;
    }

    @ObfuscatedName("kp.bw(I)I")
    public int method5418() {
        return this.field3513;
    }

    @ObfuscatedName("kp.bt(I)I")
    public int method5455() {
        return this.field3507.method6535();
    }

    @ObfuscatedName("kp.bd(I)I")
    public int method5528() {
        return this.field3508;
    }

    @ObfuscatedName("kp.bg(B)I")
    public int method5457() {
        return this.field3507.method6520();
    }

    @ObfuscatedName("kp.bb(B)Z")
    public boolean method5458() {
        return this.field3520 > 1;
    }

    @ObfuscatedName("kp.bk(I)Z")
    public boolean method5557() {
        return this.field3517 != this.field3516;
    }

    @ObfuscatedName("kp.bs(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5460(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5470(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("kp.by(Lqd;Lqd;I)V")
    public void method5521(class448 arg0, class448 arg1) {
        if ((Integer) arg1.field4833 < (Integer) arg0.field4833) {
            this.method5483((Integer) arg0.field4834, (Integer) arg1.field4833);
        } else {
            this.method5483((Integer) arg0.field4833, (Integer) arg1.field4834);
        }
    }

    @ObfuscatedName("kp.bu(IB)Lqd;")
    public class448 method5462(int arg0) {
        int var2 = this.field3507.method6608();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5468(this.field3507.method6509(var5 - 1).field4412)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5468(this.field3507.method6509(var6).field4412)) {
                var4 = var6;
                break;
            }
        }
        return new class448(var3, var4);
    }

    @ObfuscatedName("kp.bp(IB)Lqd;")
    public class448 method5463(int arg0) {
        int var2 = this.field3507.method6608();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3507.method6509(var5 - 1).field4412 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3507.method6509(var6).field4412 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class448(var3, var4);
    }

    @ObfuscatedName("kp.bc(B)Z")
    public boolean method5464() {
        if (!this.method5449()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3507.method6608() > this.field3522) {
            this.field3507.method6526(this.field3522, this.field3507.method6608());
            var1 = true;
        }
        if (this.field3507.method6572() > this.field3520) {
            int var2 = this.field3507.method6550(0, this.field3520) - 1;
            this.field3507.method6526(var2, this.field3507.method6608());
            var1 = true;
        }
        if (var1) {
            int var3 = this.field3516;
            int var4 = this.field3517;
            int var5 = this.field3507.method6608();
            if (this.field3516 > var5) {
                var3 = var5;
            }
            if (this.field3517 > var5) {
                var4 = var5;
            }
            this.method5483(var4, var3);
        }
        return var1;
    }

    @ObfuscatedName("kp.ba(IZB)V")
    public void method5452(int arg0, boolean arg1) {
        if (arg1) {
            this.method5483(this.field3517, arg0);
        } else {
            this.method5483(arg0, arg0);
        }
    }

    @ObfuscatedName("kp.bh(I)I")
    public int method5656() {
        return this.field3528 / this.field3507.method6531();
    }

    @ObfuscatedName("kp.bx(I)V")
    public void method5467() {
        class377 var1 = this.field3507.method6575(0, this.field3516);
        class448 var2 = var1.method6732();
        int var3 = this.field3507.method6531();
        int var4 = (Integer) var2.field4833 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4834 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3497;
        int var9 = this.field3523 + var8;
        int var10 = this.field3526;
        int var11 = this.field3528 + var10;
        int var12 = this.field3497;
        int var13 = this.field3526;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3523;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3528;
        }
        this.method5402(var12, var13);
    }

    @ObfuscatedName("kp.bv(IB)Z")
    public boolean method5468(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("kp.cu(I)V")
    public void method5469() {
        if (this.field3501 != null) {
            this.field3501.method2591();
        }
    }

    @ObfuscatedName("kp.cr(IB)Z")
    public boolean method5470(int arg0) {
        switch(this.field3508) {
            case 1:
                return class365.method2577((char) arg0);
            case 2:
                return class365.method3102((char) arg0);
            case 3:
                return class365.method3873((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class365.method3873(var2)) {
                    return true;
                } else if (var2 == 'k' || var2 == 'K' || var2 == 'm' || var2 == 'M' || var2 == 'b' || var2 == 'B') {
                    return true;
                } else {
                    return false;
                }
            default:
                return true;
        }
    }
}
