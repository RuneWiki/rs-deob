package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("kk")
public class class301 {

    @ObfuscatedName("kk.t")
    public class366 field3440 = new class366();

    @ObfuscatedName("kk.w")
    public class366 field3454 = new class366();

    @ObfuscatedName("kk.m")
    public boolean field3442 = false;

    @ObfuscatedName("kk.q")
    public boolean field3443 = true;

    @ObfuscatedName("kk.i")
    public int field3444 = 0;

    @ObfuscatedName("kk.e")
    public boolean field3434 = false;

    @ObfuscatedName("kk.g")
    public int field3445 = 0;

    @ObfuscatedName("kk.k")
    public int field3452 = 0;

    @ObfuscatedName("kk.v")
    public int field3448 = 0;

    @ObfuscatedName("kk.aj")
    public int field3449 = 0;

    @ObfuscatedName("kk.an")
    public int field3450 = 0;

    @ObfuscatedName("kk.ah")
    public int field3451 = 0;

    @ObfuscatedName("kk.ao")
    public int field3457 = 0;

    @ObfuscatedName("kk.ac")
    public int field3453 = Integer.MAX_VALUE;

    @ObfuscatedName("kk.af")
    public int field3433 = Integer.MAX_VALUE;

    @ObfuscatedName("kk.ad")
    public int field3447 = Integer.MAX_VALUE;

    @ObfuscatedName("kk.av")
    public int field3456 = 0;

    @ObfuscatedName("kk.ak")
    public int field3446 = 0;

    @ObfuscatedName("kk.ae")
    public int field3458 = 0;

    @ObfuscatedName("kk.ap")
    public int field3459 = 0;

    @ObfuscatedName("kk.as")
    public class295 field3460;

    @ObfuscatedName("kk.aq")
    public class295 field3461;

    public class301() {
        this.field3440.method6325(1);
        this.field3454.method6325(1);
    }

    @ObfuscatedName("kk.a(I)V")
    public void method5398() {
        this.field3444 = (this.field3444 + 1) % 60;
        if (this.field3457 > 0) {
            this.field3457--;
        }
    }

    @ObfuscatedName("kk.f(ZB)Z")
    public boolean method5220(boolean arg0) {
        boolean var2 = arg0 && this.field3443;
        boolean var3 = this.field3442 != var2;
        this.field3442 = var2;
        if (!this.field3442) {
            this.method5244(this.field3449, this.field3449);
        }
        return var3;
    }

    @ObfuscatedName("kk.c(ZI)V")
    public void method5296(boolean arg0) {
        this.field3443 = arg0;
        this.field3442 = arg0 && this.field3442;
    }

    @ObfuscatedName("kk.x(Ljava/lang/String;I)Z")
    public boolean method5222(String arg0) {
        String var2 = this.field3440.method6300();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5330(arg0);
        this.field3440.method6315(var3);
        this.method5399(this.field3458, this.field3459);
        this.method5292();
        this.method5297();
        return true;
    }

    @ObfuscatedName("kk.h(Ljava/lang/String;I)Z")
    public boolean method5243(String arg0) {
        this.field3454.method6315(arg0);
        return true;
    }

    @ObfuscatedName("kk.j(Lnt;I)Z")
    public boolean method5224(class369 arg0) {
        boolean var2 = !this.field3434;
        this.field3440.method6308(arg0);
        this.field3454.method6308(arg0);
        this.field3434 = true;
        boolean var3 = var2 | this.method5399(this.field3458, this.field3459);
        boolean var4 = var3 | this.method5244(this.field3450, this.field3449);
        if (this.method5292()) {
            this.method5297();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("kk.y(IIS)Z")
    public boolean method5225(int arg0, int arg1) {
        boolean var3 = this.field3456 != arg0 || this.field3446 != arg1;
        this.field3456 = arg0;
        this.field3446 = arg1;
        return var3 | this.method5399(this.field3458, this.field3459);
    }

    @ObfuscatedName("kk.d(II)Z")
    public boolean method5226(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3440.method6326();
        this.field3440.method6306(arg0, true);
        this.field3454.method6306(arg0, true);
        if (this.method5292()) {
            this.method5297();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("kk.n(IB)Z")
    public boolean method5227(int arg0) {
        if (arg0 < 0) {
            this.field3453 = Integer.MAX_VALUE;
        } else {
            this.field3453 = arg0;
        }
        if (this.method5292()) {
            this.method5297();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kk.r(II)Z")
    public boolean method5228(int arg0) {
        this.field3447 = arg0;
        if (this.method5292()) {
            this.method5297();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kk.l(IIB)Z")
    public boolean method5399(int arg0, int arg1) {
        if (!this.method5359()) {
            this.field3458 = arg0;
            this.field3459 = arg1;
            return false;
        }
        int var3 = this.field3458;
        int var4 = this.field3459;
        int var5 = Math.max(0, this.field3440.method6321() - this.field3456 + 2);
        int var6 = Math.max(0, this.field3440.method6389() - this.field3446 + 1);
        this.field3458 = Math.max(0, Math.min(var5, arg0));
        this.field3459 = Math.max(0, Math.min(var6, arg1));
        return this.field3458 != var3 || this.field3459 != var4;
    }

    @ObfuscatedName("kk.s(III)Z")
    public boolean method5230(int arg0, int arg1) {
        return true;
    }

    @ObfuscatedName("kk.p(II)V")
    public void method5231(int arg0) {
        this.field3440.method6310(arg0);
    }

    @ObfuscatedName("kk.b(IB)V")
    public void method5232(int arg0) {
        this.field3445 = arg0;
    }

    @ObfuscatedName("kk.o(II)V")
    public void method5233(int arg0) {
        this.field3440.method6325(arg0);
    }

    @ObfuscatedName("kk.u(II)V")
    public void method5234(int arg0) {
        this.field3440.method6307(arg0);
    }

    @ObfuscatedName("kk.z(II)Z")
    public boolean method5389(int arg0) {
        this.field3448 = arg0;
        String var2 = this.field3440.method6300();
        int var3 = var2.length();
        String var4 = this.method5330(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3440.method6315(var4);
        this.method5399(this.field3458, this.field3459);
        this.method5292();
        this.method5297();
        return true;
    }

    @ObfuscatedName("kk.t(I)V")
    public void method5236() {
        this.field3434 = false;
    }

    @ObfuscatedName("kk.w(II)Z")
    public boolean method5237(int arg0) {
        if (this.method5298(arg0)) {
            this.method5242();
            class367 var2 = this.field3440.method6305((char) arg0, this.field3449, this.field3433, this.field3453);
            this.method5244(var2.method6410(), var2.method6410());
            this.method5292();
            this.method5297();
        }
        return true;
    }

    @ObfuscatedName("kk.m(I)V")
    public void method5276() {
        if (!this.method5242() && this.field3449 > 0) {
            int var1 = this.field3440.method6317(this.field3449 - 1);
            this.method5297();
            this.method5244(var1, var1);
        }
    }

    @ObfuscatedName("kk.q(I)V")
    public void method5325() {
        if (!this.method5242() && this.field3449 < this.field3440.method6363()) {
            int var1 = this.field3440.method6317(this.field3449);
            this.method5297();
            this.method5244(var1, var1);
        }
    }

    @ObfuscatedName("kk.i(I)V")
    public void method5240() {
        if (!this.method5242() && this.field3449 > 0) {
            class438 var1 = this.method5290(this.field3449 - 1);
            int var2 = this.field3440.method6318((Integer) var1.field4765, this.field3449);
            this.method5297();
            this.method5244(var2, var2);
        }
    }

    @ObfuscatedName("kk.e(B)V")
    public void method5406() {
        if (!this.method5242() && this.field3449 < this.field3440.method6363()) {
            class438 var1 = this.method5290(this.field3449);
            int var2 = this.field3440.method6318(this.field3449, (Integer) var1.field4766);
            this.method5297();
            this.method5244(var2, var2);
        }
    }

    @ObfuscatedName("kk.g(I)Z")
    public boolean method5242() {
        if (this.method5287()) {
            int var1 = this.field3440.method6318(this.field3450, this.field3449);
            this.method5297();
            this.method5244(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kk.k(I)V")
    public void method5223() {
        this.method5244(0, this.field3440.method6363());
    }

    @ObfuscatedName("kk.v(III)Z")
    public boolean method5244(int arg0, int arg1) {
        if (!this.method5359()) {
            this.field3450 = arg0;
            this.field3449 = arg1;
            return false;
        }
        if (arg0 > this.field3440.method6363()) {
            arg0 = this.field3440.method6363();
        }
        if (arg1 > this.field3440.method6363()) {
            arg1 = this.field3440.method6363();
        }
        boolean var3 = this.field3450 != arg0 || this.field3449 != arg1;
        this.field3450 = arg0;
        if (this.field3449 != arg1) {
            this.field3449 = arg1;
            this.field3444 = 0;
            this.method5247();
        }
        if (var3 && this.field3461 != null) {
            this.field3461.method2446();
        }
        return var3;
    }

    @ObfuscatedName("kk.aj(ZI)V")
    public void method5245(boolean arg0) {
        class438 var2 = this.method5291(this.field3449);
        this.method5357((Integer) var2.field4765, arg0);
    }

    @ObfuscatedName("kk.an(ZB)V")
    public void method5306(boolean arg0) {
        class438 var2 = this.method5291(this.field3449);
        this.method5357((Integer) var2.field4766, arg0);
    }

    @ObfuscatedName("kk.ah(ZB)V")
    public void method5320(boolean arg0) {
        this.method5357(0, arg0);
    }

    @ObfuscatedName("kk.ao(ZB)V")
    public void method5278(boolean arg0) {
        this.method5357(this.field3440.method6363(), arg0);
    }

    @ObfuscatedName("kk.ac(ZI)V")
    public void method5481(boolean arg0) {
        if (this.method5287() && !arg0) {
            this.method5357(Math.min(this.field3450, this.field3449), arg0);
        } else if (this.field3449 > 0) {
            this.method5357(this.field3449 - 1, arg0);
        }
    }

    @ObfuscatedName("kk.af(ZI)V")
    public void method5239(boolean arg0) {
        if (this.method5287() && !arg0) {
            this.method5357(Math.max(this.field3450, this.field3449), arg0);
        } else if (this.field3449 < this.field3440.method6363()) {
            this.method5357(this.field3449 + 1, arg0);
        }
    }

    @ObfuscatedName("kk.ad(ZB)V")
    public void method5251(boolean arg0) {
        if (this.field3449 > 0) {
            class438 var2 = this.method5290(this.field3449 - 1);
            this.method5357((Integer) var2.field4765, arg0);
        }
    }

    @ObfuscatedName("kk.av(ZB)V")
    public void method5252(boolean arg0) {
        if (this.field3449 < this.field3440.method6363()) {
            class438 var2 = this.method5290(this.field3449 + 1);
            this.method5357((Integer) var2.field4766, arg0);
        }
    }

    @ObfuscatedName("kk.ak(ZI)V")
    public void method5339(boolean arg0) {
        if (this.field3449 > 0) {
            this.method5357(this.field3440.method6320(this.field3449, -1), arg0);
        }
    }

    @ObfuscatedName("kk.ae(ZB)V")
    public void method5463(boolean arg0) {
        if (this.field3449 < this.field3440.method6363()) {
            this.method5357(this.field3440.method6320(this.field3449, 1), arg0);
        }
    }

    @ObfuscatedName("kk.ap(ZB)V")
    public void method5221(boolean arg0) {
        if (this.field3449 > 0) {
            int var2 = this.method5294();
            this.method5357(this.field3440.method6320(this.field3449, -var2), arg0);
        }
    }

    @ObfuscatedName("kk.as(ZB)V")
    public void method5256(boolean arg0) {
        if (this.field3449 < this.field3440.method6363()) {
            int var2 = this.method5294();
            this.method5357(this.field3440.method6320(this.field3449, var2), arg0);
        }
    }

    @ObfuscatedName("kk.aq(ZI)V")
    public void method5390(boolean arg0) {
        class370 var2 = this.field3440.method6311(0, this.field3449);
        class438 var3 = var2.method6515();
        this.method5357(this.field3440.method6350((Integer) var3.field4765, this.field3459), arg0);
    }

    @ObfuscatedName("kk.al(ZI)V")
    public void method5258(boolean arg0) {
        class370 var2 = this.field3440.method6311(0, this.field3449);
        class438 var3 = var2.method6515();
        this.method5357(this.field3440.method6350((Integer) var3.field4765, this.field3459 + this.field3446), arg0);
    }

    @ObfuscatedName("kk.ag(IIZZI)V")
    public void method5259(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3434) {
            int var7 = this.field3458 + arg0;
            int var8 = this.field3459 + arg1;
            var6 = this.field3440.method6350(var7, var8);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3452 = 1;
            class438 var9 = this.method5290(var6);
            class438 var10 = this.method5290(this.field3451);
            this.method5289(var10, var9);
        } else if (arg2) {
            this.field3452 = 1;
            class438 var11 = this.method5290(var6);
            this.method5244((Integer) var11.field4765, (Integer) var11.field4766);
            this.field3451 = (Integer) var11.field4765;
        } else if (arg3) {
            this.method5244(this.field3451, var6);
        } else {
            if (this.field3457 <= 0 || this.field3451 != var6) {
                this.field3452 = 0;
                this.method5244(var6, var6);
                this.field3451 = var6;
            } else if (this.field3450 == this.field3449) {
                this.field3452 = 1;
                class438 var12 = this.method5290(var6);
                this.method5244((Integer) var12.field4765, (Integer) var12.field4766);
            } else {
                this.field3452 = 2;
                class438 var13 = this.method5291(var6);
                this.method5244((Integer) var13.field4765, (Integer) var13.field4766);
            }
            this.field3457 = 25;
        }
    }

    @ObfuscatedName("kk.am(III)V")
    public void method5260(int arg0, int arg1) {
        if (!this.field3434 || !this.method5253()) {
            return;
        }
        int var3 = this.field3458 + arg0;
        int var4 = this.field3459 + arg1;
        int var5 = this.field3440.method6350(var3, var4);
        switch(this.field3452) {
            case 0:
                this.method5244(this.field3450, var5);
                break;
            case 1:
                class438 var8 = this.method5290(this.field3451);
                class438 var9 = this.method5290(var5);
                this.method5289(var8, var9);
                break;
            case 2:
                class438 var6 = this.method5291(this.field3451);
                class438 var7 = this.method5291(var5);
                this.method5289(var6, var7);
        }
    }

    @ObfuscatedName("kk.az(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5293(Clipboard arg0) {
        class370 var2 = this.field3440.method6311(this.field3450, this.field3449);
        if (!var2.method6511()) {
            String var3 = var2.method6530();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("kk.ab(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5262(Clipboard arg0) {
        if (this.method5287()) {
            this.method5293(arg0);
            this.method5242();
        }
    }

    @ObfuscatedName("kk.ai(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5307(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5330((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5242();
            class367 var4 = this.field3440.method6355(var3, this.field3449, this.field3433, this.field3453);
            this.method5244(var4.method6410(), var4.method6410());
            this.method5292();
            this.method5297();
        } catch (Exception var6) {
            System.out.println("Error pasting clipboard to InputField.");
        }
    }

    @ObfuscatedName("kk.au(I)V")
    public void method5370() {
        this.field3459 = Math.max(0, this.field3459 - this.field3440.method6323());
    }

    @ObfuscatedName("kk.aw(I)V")
    public void method5257() {
        int var1 = Math.max(0, this.field3440.method6389() - this.field3446);
        this.field3459 = Math.min(var1, this.field3459 + this.field3440.method6323());
    }

    @ObfuscatedName("kk.at(Lko;I)V")
    public void method5266(class295 arg0) {
        this.field3460 = arg0;
    }

    @ObfuscatedName("kk.ar(Lko;I)V")
    public void method5267(class295 arg0) {
        this.field3461 = arg0;
    }

    @ObfuscatedName("kk.ay(B)Lnz;")
    public class366 method5415() {
        return this.field3440;
    }

    @ObfuscatedName("kk.ax(B)Lnz;")
    public class366 method5269() {
        return this.field3454;
    }

    @ObfuscatedName("kk.aa(I)Lnx;")
    public class370 method5270() {
        return this.field3440.method6311(this.field3450, this.field3449);
    }

    @ObfuscatedName("kk.bx(I)Z")
    public boolean method5253() {
        return this.field3442;
    }

    @ObfuscatedName("kk.bh(I)Z")
    public boolean method5272() {
        return this.field3443;
    }

    @ObfuscatedName("kk.bm(I)Z")
    public boolean method5273() {
        return this.method5253() && this.field3444 % 60 < 30;
    }

    @ObfuscatedName("kk.bp(B)I")
    public int method5274() {
        return this.field3449;
    }

    @ObfuscatedName("kk.bl(I)I")
    public int method5351() {
        return this.field3450;
    }

    @ObfuscatedName("kk.bo(I)Z")
    public boolean method5359() {
        return this.field3434;
    }

    @ObfuscatedName("kk.bg(I)I")
    public int method5277() {
        return this.field3458;
    }

    @ObfuscatedName("kk.bd(S)I")
    public int method5345() {
        return this.field3459;
    }

    @ObfuscatedName("kk.bq(B)I")
    public int method5279() {
        return this.field3440.method6326();
    }

    @ObfuscatedName("kk.bc(B)I")
    public int method5280() {
        return this.field3453;
    }

    @ObfuscatedName("kk.bv(I)I")
    public int method5281() {
        return this.field3447;
    }

    @ObfuscatedName("kk.bt(B)I")
    public int method5282() {
        return this.field3445;
    }

    @ObfuscatedName("kk.ba(I)I")
    public int method5483() {
        return this.field3440.method6313();
    }

    @ObfuscatedName("kk.br(I)I")
    public int method5407() {
        return this.field3448;
    }

    @ObfuscatedName("kk.be(I)I")
    public int method5285() {
        return this.field3440.method6328();
    }

    @ObfuscatedName("kk.by(I)Z")
    public boolean method5286() {
        return this.field3453 > 1;
    }

    @ObfuscatedName("kk.bb(I)Z")
    public boolean method5287() {
        return this.field3450 != this.field3449;
    }

    @ObfuscatedName("kk.bu(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5330(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5298(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("kk.bj(Lpv;Lpv;I)V")
    public void method5289(class438 arg0, class438 arg1) {
        if ((Integer) arg1.field4765 < (Integer) arg0.field4765) {
            this.method5244((Integer) arg0.field4766, (Integer) arg1.field4765);
        } else {
            this.method5244((Integer) arg0.field4765, (Integer) arg1.field4766);
        }
    }

    @ObfuscatedName("kk.bw(II)Lpv;")
    public class438 method5290(int arg0) {
        int var2 = this.field3440.method6363();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5428(this.field3440.method6301(var5 - 1).field4348)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5428(this.field3440.method6301(var6).field4348)) {
                var4 = var6;
                break;
            }
        }
        return new class438(var3, var4);
    }

    @ObfuscatedName("kk.bn(II)Lpv;")
    public class438 method5291(int arg0) {
        int var2 = this.field3440.method6363();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3440.method6301(var5 - 1).field4348 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3440.method6301(var6).field4348 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class438(var3, var4);
    }

    @ObfuscatedName("kk.bf(I)Z")
    public boolean method5292() {
        if (!this.method5359()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3440.method6363() > this.field3447) {
            this.field3440.method6318(this.field3447, this.field3440.method6363());
            var1 = true;
        }
        if (this.field3440.method6324() > this.field3453) {
            int var2 = this.field3440.method6320(0, this.field3453) - 1;
            this.field3440.method6318(var2, this.field3440.method6363());
            var1 = true;
        }
        if (var1) {
            int var3 = this.field3449;
            int var4 = this.field3450;
            int var5 = this.field3440.method6363();
            if (this.field3449 > var5) {
                var3 = var5;
            }
            if (this.field3450 > var5) {
                var4 = var5;
            }
            this.method5244(var4, var3);
        }
        return var1;
    }

    @ObfuscatedName("kk.bz(IZI)V")
    public void method5357(int arg0, boolean arg1) {
        if (arg1) {
            this.method5244(this.field3450, arg0);
        } else {
            this.method5244(arg0, arg0);
        }
    }

    @ObfuscatedName("kk.bi(B)I")
    public int method5294() {
        return this.field3446 / this.field3440.method6323();
    }

    @ObfuscatedName("kk.bs(B)V")
    public void method5247() {
        class370 var1 = this.field3440.method6311(0, this.field3449);
        class438 var2 = var1.method6515();
        int var3 = this.field3440.method6323();
        int var4 = (Integer) var2.field4765 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4766 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3458;
        int var9 = this.field3456 + var8;
        int var10 = this.field3459;
        int var11 = this.field3446 + var10;
        int var12 = this.field3458;
        int var13 = this.field3459;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3456;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3446;
        }
        this.method5399(var12, var13);
    }

    @ObfuscatedName("kk.cd(IB)Z")
    public boolean method5428(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("kk.cg(B)V")
    public void method5297() {
        if (this.field3460 != null) {
            this.field3460.method2446();
        }
    }

    @ObfuscatedName("kk.cs(IB)Z")
    public boolean method5298(int arg0) {
        switch(this.field3448) {
            case 1:
                return class358.method2894((char) arg0);
            case 2:
                return class358.method2681((char) arg0);
            case 3:
                return class358.method5949((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class358.method5949(var2)) {
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
