package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("ki")
public class class304 {

    @ObfuscatedName("ki.s")
    public class369 field3492 = new class369();

    @ObfuscatedName("ki.l")
    public class369 field3484 = new class369();

    @ObfuscatedName("ki.t")
    public boolean field3494 = false;

    @ObfuscatedName("ki.c")
    public boolean field3490 = true;

    @ObfuscatedName("ki.p")
    public int field3509 = 0;

    @ObfuscatedName("ki.d")
    public boolean field3497 = false;

    @ObfuscatedName("ki.y")
    public int field3498 = 0;

    @ObfuscatedName("ki.z")
    public int field3499 = 0;

    @ObfuscatedName("ki.w")
    public int field3500 = 0;

    @ObfuscatedName("ki.as")
    public int field3493 = 0;

    @ObfuscatedName("ki.ad")
    public int field3502 = 0;

    @ObfuscatedName("ki.ao")
    public int field3503 = 0;

    @ObfuscatedName("ki.am")
    public int field3504 = 0;

    @ObfuscatedName("ki.av")
    public int field3501 = Integer.MAX_VALUE;

    @ObfuscatedName("ki.au")
    public int field3485 = Integer.MAX_VALUE;

    @ObfuscatedName("ki.ar")
    public int field3487 = Integer.MAX_VALUE;

    @ObfuscatedName("ki.at")
    public int field3508 = 0;

    @ObfuscatedName("ki.ay")
    public int field3507 = 0;

    @ObfuscatedName("ki.an")
    public int field3486 = 0;

    @ObfuscatedName("ki.ab")
    public int field3483 = 0;

    @ObfuscatedName("ki.al")
    public class298 field3512;

    @ObfuscatedName("ki.ag")
    public class298 field3513;

    public class304() {
        this.field3492.method6487(1);
        this.field3484.method6487(1);
    }

    @ObfuscatedName("ki.h(I)V")
    public void method5293() {
        this.field3509 = (this.field3509 + 1) % 60;
        if (this.field3504 > 0) {
            this.field3504--;
        }
    }

    @ObfuscatedName("ki.e(ZI)Z")
    public boolean method5294(boolean arg0) {
        boolean var2 = arg0 && this.field3490;
        boolean var3 = this.field3494 != var2;
        this.field3494 = var2;
        if (!this.field3494) {
            this.method5318(this.field3493, this.field3493);
        }
        return var3;
    }

    @ObfuscatedName("ki.v(ZI)V")
    public void method5295(boolean arg0) {
        this.field3490 = arg0;
        this.field3494 = arg0 && this.field3494;
    }

    @ObfuscatedName("ki.x(Ljava/lang/String;I)Z")
    public boolean method5296(String arg0) {
        String var2 = this.field3492.method6455();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5362(arg0);
        this.field3492.method6415(var3);
        this.method5303(this.field3486, this.field3483);
        this.method5334();
        this.method5371();
        return true;
    }

    @ObfuscatedName("ki.m(Ljava/lang/String;I)Z")
    public boolean method5538(String arg0) {
        this.field3484.method6415(arg0);
        return true;
    }

    @ObfuscatedName("ki.q(Lne;S)Z")
    public boolean method5298(class372 arg0) {
        boolean var2 = !this.field3497;
        this.field3492.method6472(arg0);
        this.field3484.method6472(arg0);
        this.field3497 = true;
        boolean var3 = var2 | this.method5303(this.field3486, this.field3483);
        boolean var4 = var3 | this.method5318(this.field3502, this.field3493);
        if (this.method5334()) {
            this.method5371();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("ki.f(III)Z")
    public boolean method5299(int arg0, int arg1) {
        boolean var3 = this.field3508 != arg0 || this.field3507 != arg1;
        this.field3508 = arg0;
        this.field3507 = arg1;
        return var3 | this.method5303(this.field3486, this.field3483);
    }

    @ObfuscatedName("ki.r(IB)Z")
    public boolean method5300(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3492.method6426();
        this.field3492.method6406(arg0, true);
        this.field3484.method6406(arg0, true);
        if (this.method5334()) {
            this.method5371();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("ki.u(II)Z")
    public boolean method5301(int arg0) {
        if (arg0 < 0) {
            this.field3501 = Integer.MAX_VALUE;
        } else {
            this.field3501 = arg0;
        }
        if (this.method5334()) {
            this.method5371();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ki.b(IB)Z")
    public boolean method5302(int arg0) {
        this.field3487 = arg0;
        if (this.method5334()) {
            this.method5371();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ki.j(III)Z")
    public boolean method5303(int arg0, int arg1) {
        if (!this.method5476()) {
            this.field3486 = arg0;
            this.field3483 = arg1;
            return false;
        }
        int var3 = this.field3486;
        int var4 = this.field3483;
        int var5 = Math.max(0, this.field3492.method6421() - this.field3508 + 2);
        int var6 = Math.max(0, this.field3492.method6504() - this.field3507 + 1);
        this.field3486 = Math.max(0, Math.min(var5, arg0));
        this.field3483 = Math.max(0, Math.min(var6, arg1));
        return this.field3486 != var3 || this.field3483 != var4;
    }

    @ObfuscatedName("ki.g(III)Z")
    public boolean method5304(int arg0, int arg1) {
        return true;
    }

    @ObfuscatedName("ki.i(II)V")
    public void method5305(int arg0) {
        this.field3492.method6481(arg0);
    }

    @ObfuscatedName("ki.o(II)V")
    public void method5306(int arg0) {
        this.field3498 = arg0;
    }

    @ObfuscatedName("ki.n(II)V")
    public void method5429(int arg0) {
        this.field3492.method6487(arg0);
    }

    @ObfuscatedName("ki.k(II)V")
    public void method5355(int arg0) {
        this.field3492.method6407(arg0);
    }

    @ObfuscatedName("ki.a(IB)Z")
    public boolean method5458(int arg0) {
        this.field3500 = arg0;
        String var2 = this.field3492.method6455();
        int var3 = var2.length();
        String var4 = this.method5362(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3492.method6415(var4);
        this.method5303(this.field3486, this.field3483);
        this.method5334();
        this.method5371();
        return true;
    }

    @ObfuscatedName("ki.s(I)V")
    public void method5310() {
        this.field3497 = false;
    }

    @ObfuscatedName("ki.l(II)Z")
    public boolean method5311(int arg0) {
        if (this.method5343(arg0)) {
            this.method5316();
            class370 var2 = this.field3492.method6412((char) arg0, this.field3493, this.field3485, this.field3501);
            this.method5318(var2.method6509(), var2.method6509());
            this.method5334();
            this.method5371();
        }
        return true;
    }

    @ObfuscatedName("ki.t(S)V")
    public void method5312() {
        if (!this.method5316() && this.field3493 > 0) {
            int var1 = this.field3492.method6417(this.field3493 - 1);
            this.method5371();
            this.method5318(var1, var1);
        }
    }

    @ObfuscatedName("ki.c(B)V")
    public void method5313() {
        if (!this.method5316() && this.field3493 < this.field3492.method6405()) {
            int var1 = this.field3492.method6417(this.field3493);
            this.method5371();
            this.method5318(var1, var1);
        }
    }

    @ObfuscatedName("ki.p(I)V")
    public void method5314() {
        if (!this.method5316() && this.field3493 > 0) {
            class441 var1 = this.method5364(this.field3493 - 1);
            int var2 = this.field3492.method6410((Integer) var1.field4812, this.field3493);
            this.method5371();
            this.method5318(var2, var2);
        }
    }

    @ObfuscatedName("ki.d(S)V")
    public void method5315() {
        if (!this.method5316() && this.field3493 < this.field3492.method6405()) {
            class441 var1 = this.method5364(this.field3493);
            int var2 = this.field3492.method6410(this.field3493, (Integer) var1.field4810);
            this.method5371();
            this.method5318(var2, var2);
        }
    }

    @ObfuscatedName("ki.y(I)Z")
    public boolean method5316() {
        if (this.method5361()) {
            int var1 = this.field3492.method6410(this.field3502, this.field3493);
            this.method5371();
            this.method5318(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ki.z(I)V")
    public void method5530() {
        this.method5318(0, this.field3492.method6405());
    }

    @ObfuscatedName("ki.w(IIB)Z")
    public boolean method5318(int arg0, int arg1) {
        if (!this.method5476()) {
            this.field3502 = arg0;
            this.field3493 = arg1;
            return false;
        }
        if (arg0 > this.field3492.method6405()) {
            arg0 = this.field3492.method6405();
        }
        if (arg1 > this.field3492.method6405()) {
            arg1 = this.field3492.method6405();
        }
        boolean var3 = this.field3502 != arg0 || this.field3493 != arg1;
        this.field3502 = arg0;
        if (this.field3493 != arg1) {
            this.field3493 = arg1;
            this.field3509 = 0;
            this.method5369();
        }
        if (var3 && this.field3513 != null) {
            this.field3513.method2482();
        }
        return var3;
    }

    @ObfuscatedName("ki.as(ZB)V")
    public void method5557(boolean arg0) {
        class441 var2 = this.method5451(this.field3493);
        this.method5526((Integer) var2.field4812, arg0);
    }

    @ObfuscatedName("ki.ad(ZI)V")
    public void method5320(boolean arg0) {
        class441 var2 = this.method5451(this.field3493);
        this.method5526((Integer) var2.field4810, arg0);
    }

    @ObfuscatedName("ki.ao(ZI)V")
    public void method5321(boolean arg0) {
        this.method5526(0, arg0);
    }

    @ObfuscatedName("ki.am(ZI)V")
    public void method5322(boolean arg0) {
        this.method5526(this.field3492.method6405(), arg0);
    }

    @ObfuscatedName("ki.av(ZI)V")
    public void method5323(boolean arg0) {
        if (this.method5361() && !arg0) {
            this.method5526(Math.min(this.field3502, this.field3493), arg0);
        } else if (this.field3493 > 0) {
            this.method5526(this.field3493 - 1, arg0);
        }
    }

    @ObfuscatedName("ki.au(ZB)V")
    public void method5324(boolean arg0) {
        if (this.method5361() && !arg0) {
            this.method5526(Math.max(this.field3502, this.field3493), arg0);
        } else if (this.field3493 < this.field3492.method6405()) {
            this.method5526(this.field3493 + 1, arg0);
        }
    }

    @ObfuscatedName("ki.ar(ZB)V")
    public void method5325(boolean arg0) {
        if (this.field3493 > 0) {
            class441 var2 = this.method5364(this.field3493 - 1);
            this.method5526((Integer) var2.field4812, arg0);
        }
    }

    @ObfuscatedName("ki.at(ZB)V")
    public void method5317(boolean arg0) {
        if (this.field3493 < this.field3492.method6405()) {
            class441 var2 = this.method5364(this.field3493 + 1);
            this.method5526((Integer) var2.field4810, arg0);
        }
    }

    @ObfuscatedName("ki.ay(ZI)V")
    public void method5442(boolean arg0) {
        if (this.field3493 > 0) {
            this.method5526(this.field3492.method6420(this.field3493, -1), arg0);
        }
    }

    @ObfuscatedName("ki.an(ZB)V")
    public void method5349(boolean arg0) {
        if (this.field3493 < this.field3492.method6405()) {
            this.method5526(this.field3492.method6420(this.field3493, 1), arg0);
        }
    }

    @ObfuscatedName("ki.ab(ZS)V")
    public void method5329(boolean arg0) {
        if (this.field3493 > 0) {
            int var2 = this.method5368();
            this.method5526(this.field3492.method6420(this.field3493, -var2), arg0);
        }
    }

    @ObfuscatedName("ki.al(ZI)V")
    public void method5330(boolean arg0) {
        if (this.field3493 < this.field3492.method6405()) {
            int var2 = this.method5368();
            this.method5526(this.field3492.method6420(this.field3493, var2), arg0);
        }
    }

    @ObfuscatedName("ki.ag(ZB)V")
    public void method5331(boolean arg0) {
        class373 var2 = this.field3492.method6456(0, this.field3493);
        class441 var3 = var2.method6615();
        this.method5526(this.field3492.method6419((Integer) var3.field4812, this.field3483), arg0);
    }

    @ObfuscatedName("ki.az(ZI)V")
    public void method5332(boolean arg0) {
        class373 var2 = this.field3492.method6456(0, this.field3493);
        class441 var3 = var2.method6615();
        this.method5526(this.field3492.method6419((Integer) var3.field4812, this.field3507 + this.field3483), arg0);
    }

    @ObfuscatedName("ki.ak(IIZZB)V")
    public void method5333(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3497) {
            int var7 = this.field3486 + arg0;
            int var8 = this.field3483 + arg1;
            var6 = this.field3492.method6419(var7, var8);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3499 = 1;
            class441 var9 = this.method5364(var6);
            class441 var10 = this.method5364(this.field3503);
            this.method5472(var10, var9);
        } else if (arg2) {
            this.field3499 = 1;
            class441 var11 = this.method5364(var6);
            this.method5318((Integer) var11.field4812, (Integer) var11.field4810);
            this.field3503 = (Integer) var11.field4812;
        } else if (arg3) {
            this.method5318(this.field3503, var6);
        } else {
            if (this.field3504 <= 0 || this.field3503 != var6) {
                this.field3499 = 0;
                this.method5318(var6, var6);
                this.field3503 = var6;
            } else if (this.field3502 == this.field3493) {
                this.field3499 = 1;
                class441 var12 = this.method5364(var6);
                this.method5318((Integer) var12.field4812, (Integer) var12.field4810);
            } else {
                this.field3499 = 2;
                class441 var13 = this.method5451(var6);
                this.method5318((Integer) var13.field4812, (Integer) var13.field4810);
            }
            this.field3504 = 25;
        }
    }

    @ObfuscatedName("ki.af(III)V")
    public void method5516(int arg0, int arg1) {
        if (!this.field3497 || !this.method5377()) {
            return;
        }
        int var3 = this.field3486 + arg0;
        int var4 = this.field3483 + arg1;
        int var5 = this.field3492.method6419(var3, var4);
        switch(this.field3499) {
            case 0:
                this.method5318(this.field3502, var5);
                break;
            case 1:
                class441 var8 = this.method5364(this.field3503);
                class441 var9 = this.method5364(var5);
                this.method5472(var8, var9);
                break;
            case 2:
                class441 var6 = this.method5451(this.field3503);
                class441 var7 = this.method5451(var5);
                this.method5472(var6, var7);
        }
    }

    @ObfuscatedName("ki.ai(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5448(Clipboard arg0) {
        class373 var2 = this.field3492.method6456(this.field3502, this.field3493);
        if (!var2.method6611()) {
            String var3 = var2.method6632();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("ki.ax(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5336(Clipboard arg0) {
        if (this.method5361()) {
            this.method5448(arg0);
            this.method5316();
        }
    }

    @ObfuscatedName("ki.ah(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5337(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5362((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5316();
            class370 var4 = this.field3492.method6413(var3, this.field3493, this.field3485, this.field3501);
            this.method5318(var4.method6509(), var4.method6509());
            this.method5334();
            this.method5371();
        } catch (Exception var6) {
            System.out.println("Error pasting clipboard to InputField.");
        }
    }

    @ObfuscatedName("ki.aw(I)V")
    public void method5338() {
        this.field3483 = Math.max(0, this.field3483 - this.field3492.method6495());
    }

    @ObfuscatedName("ki.aj(I)V")
    public void method5415() {
        int var1 = Math.max(0, this.field3492.method6504() - this.field3507);
        this.field3483 = Math.min(var1, this.field3483 + this.field3492.method6495());
    }

    @ObfuscatedName("ki.aq(Lkr;I)V")
    public void method5340(class298 arg0) {
        this.field3512 = arg0;
    }

    @ObfuscatedName("ki.ap(Lkr;I)V")
    public void method5341(class298 arg0) {
        this.field3513 = arg0;
    }

    @ObfuscatedName("ki.aa(I)Lnu;")
    public class369 method5418() {
        return this.field3492;
    }

    @ObfuscatedName("ki.ae(I)Lnu;")
    public class369 method5307() {
        return this.field3484;
    }

    @ObfuscatedName("ki.ac(B)Lna;")
    public class373 method5344() {
        return this.field3492.method6456(this.field3502, this.field3493);
    }

    @ObfuscatedName("ki.bh(I)Z")
    public boolean method5377() {
        return this.field3494;
    }

    @ObfuscatedName("ki.by(B)Z")
    public boolean method5292() {
        return this.field3490;
    }

    @ObfuscatedName("ki.bw(S)Z")
    public boolean method5347() {
        return this.method5377() && this.field3509 % 60 < 30;
    }

    @ObfuscatedName("ki.bp(I)I")
    public int method5348() {
        return this.field3493;
    }

    @ObfuscatedName("ki.bc(B)I")
    public int method5327() {
        return this.field3502;
    }

    @ObfuscatedName("ki.bl(I)Z")
    public boolean method5476() {
        return this.field3497;
    }

    @ObfuscatedName("ki.bv(I)I")
    public int method5351() {
        return this.field3486;
    }

    @ObfuscatedName("ki.bx(I)I")
    public int method5352() {
        return this.field3483;
    }

    @ObfuscatedName("ki.bg(S)I")
    public int method5353() {
        return this.field3492.method6426();
    }

    @ObfuscatedName("ki.bz(B)I")
    public int method5354() {
        return this.field3501;
    }

    @ObfuscatedName("ki.bi(I)I")
    public int method5525() {
        return this.field3487;
    }

    @ObfuscatedName("ki.br(I)I")
    public int method5356() {
        return this.field3498;
    }

    @ObfuscatedName("ki.bq(I)I")
    public int method5468() {
        return this.field3492.method6427();
    }

    @ObfuscatedName("ki.bn(I)I")
    public int method5358() {
        return this.field3500;
    }

    @ObfuscatedName("ki.ba(I)I")
    public int method5438() {
        return this.field3492.method6468();
    }

    @ObfuscatedName("ki.bs(I)Z")
    public boolean method5360() {
        return this.field3501 > 1;
    }

    @ObfuscatedName("ki.bt(I)Z")
    public boolean method5361() {
        return this.field3502 != this.field3493;
    }

    @ObfuscatedName("ki.bu(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5362(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5343(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("ki.bj(Lpg;Lpg;I)V")
    public void method5472(class441 arg0, class441 arg1) {
        if ((Integer) arg1.field4812 < (Integer) arg0.field4812) {
            this.method5318((Integer) arg0.field4810, (Integer) arg1.field4812);
        } else {
            this.method5318((Integer) arg0.field4812, (Integer) arg1.field4810);
        }
    }

    @ObfuscatedName("ki.bb(II)Lpg;")
    public class441 method5364(int arg0) {
        int var2 = this.field3492.method6405();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5443(this.field3492.method6402(var5 - 1).field4396)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5443(this.field3492.method6402(var6).field4396)) {
                var4 = var6;
                break;
            }
        }
        return new class441(var3, var4);
    }

    @ObfuscatedName("ki.bm(II)Lpg;")
    public class441 method5451(int arg0) {
        int var2 = this.field3492.method6405();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3492.method6402(var5 - 1).field4396 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3492.method6402(var6).field4396 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class441(var3, var4);
    }

    @ObfuscatedName("ki.bk(I)Z")
    public boolean method5334() {
        if (!this.method5476()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3492.method6405() > this.field3487) {
            this.field3492.method6410(this.field3487, this.field3492.method6405());
            var1 = true;
        }
        if (this.field3492.method6497() > this.field3501) {
            int var2 = this.field3492.method6420(0, this.field3501) - 1;
            this.field3492.method6410(var2, this.field3492.method6405());
            var1 = true;
        }
        if (var1) {
            int var3 = this.field3493;
            int var4 = this.field3502;
            int var5 = this.field3492.method6405();
            if (this.field3493 > var5) {
                var3 = var5;
            }
            if (this.field3502 > var5) {
                var4 = var5;
            }
            this.method5318(var4, var3);
        }
        return var1;
    }

    @ObfuscatedName("ki.bd(IZI)V")
    public void method5526(int arg0, boolean arg1) {
        if (arg1) {
            this.method5318(this.field3502, arg0);
        } else {
            this.method5318(arg0, arg0);
        }
    }

    @ObfuscatedName("ki.cf(I)I")
    public int method5368() {
        return this.field3507 / this.field3492.method6495();
    }

    @ObfuscatedName("ki.cl(I)V")
    public void method5369() {
        class373 var1 = this.field3492.method6456(0, this.field3493);
        class441 var2 = var1.method6615();
        int var3 = this.field3492.method6495();
        int var4 = (Integer) var2.field4812 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4810 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3486;
        int var9 = this.field3508 + var8;
        int var10 = this.field3483;
        int var11 = this.field3507 + var10;
        int var12 = this.field3486;
        int var13 = this.field3483;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3508;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3507;
        }
        this.method5303(var12, var13);
    }

    @ObfuscatedName("ki.cq(II)Z")
    public boolean method5443(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("ki.cc(B)V")
    public void method5371() {
        if (this.field3512 != null) {
            this.field3512.method2482();
        }
    }

    @ObfuscatedName("ki.cw(II)Z")
    public boolean method5343(int arg0) {
        switch(this.field3500) {
            case 1:
                return class361.method3573((char) arg0);
            case 2:
                return class361.method4401((char) arg0);
            case 3:
                return class361.method4452((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class361.method4452(var2)) {
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
