package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("mh")
public class class328 {

    @ObfuscatedName("mh.ah")
    public class393 field3567 = new class393();

    @ObfuscatedName("mh.az")
    public class393 field3561 = new class393();

    @ObfuscatedName("mh.au")
    public boolean field3568 = false;

    @ObfuscatedName("mh.ai")
    public boolean field3563 = true;

    @ObfuscatedName("mh.aq")
    public int field3564 = 0;

    @ObfuscatedName("mh.aw")
    public boolean field3565 = false;

    @ObfuscatedName("mh.ay")
    public int field3566 = 0;

    @ObfuscatedName("mh.al")
    public int field3575 = 0;

    @ObfuscatedName("mh.am")
    public int field3570 = 0;

    @ObfuscatedName("mh.bs")
    public int field3569 = 0;

    @ObfuscatedName("mh.bc")
    public int field3580 = 0;

    @ObfuscatedName("mh.bj")
    public int field3555 = 0;

    @ObfuscatedName("mh.bo")
    public int field3572 = 0;

    @ObfuscatedName("mh.bq")
    public int field3573 = Integer.MAX_VALUE;

    @ObfuscatedName("mh.bg")
    public int field3574 = Integer.MAX_VALUE;

    @ObfuscatedName("mh.bf")
    public int field3571 = 0;

    @ObfuscatedName("mh.bd")
    public int field3576 = 0;

    @ObfuscatedName("mh.ba")
    public int field3577 = 0;

    @ObfuscatedName("mh.bn")
    public int field3578 = 0;

    @ObfuscatedName("mh.bb")
    public class322 field3579;

    @ObfuscatedName("mh.bx")
    public class322 field3553;

    public class328() {
        this.field3567.method6628(1);
        this.field3561.method6628(1);
    }

    @ObfuscatedName("mh.at(I)V")
    public void method5558() {
        this.field3564 = (this.field3564 + 1) % 60;
        if (this.field3572 > 0) {
            this.field3572--;
        }
    }

    @ObfuscatedName("mh.an(ZB)Z")
    public boolean method5479(boolean arg0) {
        boolean var2 = arg0 && this.field3563;
        boolean var3 = this.field3568 != var2;
        this.field3568 = var2;
        if (!this.field3568) {
            this.method5503(this.field3569, this.field3569);
        }
        return var3;
    }

    @ObfuscatedName("mh.av(ZI)V")
    public void method5480(boolean arg0) {
        this.field3563 = arg0;
        this.field3568 = arg0 && this.field3568;
    }

    @ObfuscatedName("mh.as(Ljava/lang/String;I)Z")
    public boolean method5757(String arg0) {
        String var2 = this.field3567.method6623();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5547(arg0);
        this.field3567.method6635(var3);
        this.method5761(this.field3577, this.field3578);
        this.method5740();
        this.method5556();
        return true;
    }

    @ObfuscatedName("mh.ax(Ljava/lang/String;I)Z")
    public boolean method5642(String arg0) {
        this.field3561.method6635(arg0);
        return true;
    }

    @ObfuscatedName("mh.ap(Lpn;I)Z")
    public boolean method5483(class396 arg0) {
        boolean var2 = !this.field3565;
        this.field3567.method6627(arg0);
        this.field3561.method6627(arg0);
        this.field3565 = true;
        boolean var3 = var2 | this.method5761(this.field3577, this.field3578);
        boolean var4 = var3 | this.method5503(this.field3580, this.field3569);
        if (this.method5740()) {
            this.method5556();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("mh.ab(III)Z")
    public boolean method5484(int arg0, int arg1) {
        boolean var3 = this.field3571 != arg0 || this.field3576 != arg1;
        this.field3571 = arg0;
        this.field3576 = arg1;
        return var3 | this.method5761(this.field3577, this.field3578);
    }

    @ObfuscatedName("mh.ak(II)Z")
    public boolean method5590(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3567.method6646();
        this.field3567.method6753(arg0);
        this.field3561.method6753(arg0);
        if (this.method5740()) {
            this.method5556();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("mh.ae(II)Z")
    public boolean method5533(int arg0) {
        this.field3567.method6625(arg0);
        if (this.method5740()) {
            this.method5556();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mh.af(II)Z")
    public boolean method5487(int arg0) {
        this.field3574 = arg0;
        if (this.method5740()) {
            this.method5556();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mh.ao(IIB)Z")
    public boolean method5761(int arg0, int arg1) {
        if (!this.method5661()) {
            this.field3577 = arg0;
            this.field3578 = arg1;
            return false;
        }
        int var3 = this.field3577;
        int var4 = this.field3578;
        int var5 = Math.max(0, this.field3567.method6641() - this.field3571 + 2);
        int var6 = Math.max(0, this.field3567.method6644() - this.field3576 + 1);
        this.field3577 = Math.max(0, Math.min(var5, arg0));
        this.field3578 = Math.max(0, Math.min(var6, arg1));
        return this.field3577 != var3 || this.field3578 != var4;
    }

    @ObfuscatedName("mh.aa(III)Z")
    public boolean method5489(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3567.method6629(arg0, arg1) : false;
    }

    @ObfuscatedName("mh.aj(II)V")
    public void method5490(int arg0) {
        this.field3567.method6717(arg0);
    }

    @ObfuscatedName("mh.ad(II)V")
    public void method5591(int arg0) {
        this.field3566 = arg0;
    }

    @ObfuscatedName("mh.ac(II)V")
    public void method5492(int arg0) {
        this.field3567.method6628(arg0);
    }

    @ObfuscatedName("mh.ag(II)V")
    public void method5493(int arg0) {
        this.field3567.method6626(arg0);
    }

    @ObfuscatedName("mh.ar(IB)Z")
    public boolean method5494(int arg0) {
        this.field3570 = arg0;
        String var2 = this.field3567.method6623();
        int var3 = var2.length();
        String var4 = this.method5547(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3567.method6635(var4);
        this.method5761(this.field3577, this.field3578);
        this.method5740();
        this.method5556();
        return true;
    }

    @ObfuscatedName("mh.ah(I)V")
    public void method5495() {
        this.field3565 = false;
    }

    @ObfuscatedName("mh.az(IB)Z")
    public boolean method5677(int arg0) {
        if (this.method5557(arg0)) {
            this.method5609();
            class394 var2 = this.field3567.method6632((char) arg0, this.field3569, this.field3573);
            this.method5503(var2.method6768(), var2.method6768());
            this.method5740();
            this.method5556();
        }
        return true;
    }

    @ObfuscatedName("mh.au(I)V")
    public void method5696() {
        if (!this.method5609() && this.field3569 > 0) {
            int var1 = this.field3567.method6637(this.field3569 - 1);
            this.method5556();
            this.method5503(var1, var1);
        }
    }

    @ObfuscatedName("mh.ai(I)V")
    public void method5498() {
        if (!this.method5609() && this.field3569 < this.field3567.method6622()) {
            int var1 = this.field3567.method6637(this.field3569);
            this.method5556();
            this.method5503(var1, var1);
        }
    }

    @ObfuscatedName("mh.aq(I)V")
    public void method5499() {
        if (!this.method5609() && this.field3569 > 0) {
            class474 var1 = this.method5549(this.field3569 - 1);
            int var2 = this.field3567.method6638((Integer) var1.field4904, this.field3569);
            this.method5556();
            this.method5503(var2, var2);
        }
    }

    @ObfuscatedName("mh.aw(I)V")
    public void method5671() {
        if (!this.method5609() && this.field3569 < this.field3567.method6622()) {
            class474 var1 = this.method5549(this.field3569);
            int var2 = this.field3567.method6638(this.field3569, (Integer) var1.field4905);
            this.method5556();
            this.method5503(var2, var2);
        }
    }

    @ObfuscatedName("mh.ay(I)Z")
    public boolean method5609() {
        if (this.method5546()) {
            int var1 = this.field3567.method6638(this.field3580, this.field3569);
            this.method5556();
            this.method5503(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mh.al(I)V")
    public void method5502() {
        this.method5503(0, this.field3567.method6622());
    }

    @ObfuscatedName("mh.am(IIB)Z")
    public boolean method5503(int arg0, int arg1) {
        if (!this.method5661()) {
            this.field3580 = arg0;
            this.field3569 = arg1;
            return false;
        }
        if (arg0 > this.field3567.method6622()) {
            arg0 = this.field3567.method6622();
        }
        if (arg1 > this.field3567.method6622()) {
            arg1 = this.field3567.method6622();
        }
        boolean var3 = this.field3580 != arg0 || this.field3569 != arg1;
        this.field3580 = arg0;
        if (this.field3569 != arg1) {
            this.field3569 = arg1;
            this.field3564 = 0;
            this.method5554();
        }
        if (var3 && this.field3553 != null) {
            this.field3553.method2530();
        }
        return var3;
    }

    @ObfuscatedName("mh.bs(ZI)V")
    public void method5754(boolean arg0) {
        class474 var2 = this.method5550(this.field3569);
        this.method5552((Integer) var2.field4904, arg0);
    }

    @ObfuscatedName("mh.bc(ZB)V")
    public void method5639(boolean arg0) {
        class474 var2 = this.method5550(this.field3569);
        this.method5552((Integer) var2.field4905, arg0);
    }

    @ObfuscatedName("mh.bj(ZI)V")
    public void method5506(boolean arg0) {
        this.method5552(0, arg0);
    }

    @ObfuscatedName("mh.bo(ZI)V")
    public void method5507(boolean arg0) {
        this.method5552(this.field3567.method6622(), arg0);
    }

    @ObfuscatedName("mh.bq(ZB)V")
    public void method5689(boolean arg0) {
        if (this.method5546() && !arg0) {
            this.method5552(Math.min(this.field3580, this.field3569), arg0);
        } else if (this.field3569 > 0) {
            this.method5552(this.field3569 - 1, arg0);
        }
    }

    @ObfuscatedName("mh.bg(ZB)V")
    public void method5717(boolean arg0) {
        if (this.method5546() && !arg0) {
            this.method5552(Math.max(this.field3580, this.field3569), arg0);
        } else if (this.field3569 < this.field3567.method6622()) {
            this.method5552(this.field3569 + 1, arg0);
        }
    }

    @ObfuscatedName("mh.bf(ZI)V")
    public void method5510(boolean arg0) {
        if (this.field3569 > 0) {
            class474 var2 = this.method5549(this.field3569 - 1);
            this.method5552((Integer) var2.field4904, arg0);
        }
    }

    @ObfuscatedName("mh.bd(ZI)V")
    public void method5518(boolean arg0) {
        if (this.field3569 < this.field3567.method6622()) {
            class474 var2 = this.method5549(this.field3569 + 1);
            this.method5552((Integer) var2.field4905, arg0);
        }
    }

    @ObfuscatedName("mh.ba(ZB)V")
    public void method5512(boolean arg0) {
        if (this.field3569 > 0) {
            this.method5552(this.field3567.method6645(this.field3569, -1), arg0);
        }
    }

    @ObfuscatedName("mh.bn(ZB)V")
    public void method5669(boolean arg0) {
        if (this.field3569 < this.field3567.method6622()) {
            this.method5552(this.field3567.method6645(this.field3569, 1), arg0);
        }
    }

    @ObfuscatedName("mh.bb(ZI)V")
    public void method5514(boolean arg0) {
        if (this.field3569 > 0) {
            int var2 = this.method5553();
            this.method5552(this.field3567.method6645(this.field3569, -var2), arg0);
        }
    }

    @ObfuscatedName("mh.bx(ZI)V")
    public void method5515(boolean arg0) {
        if (this.field3569 < this.field3567.method6622()) {
            int var2 = this.method5553();
            this.method5552(this.field3567.method6645(this.field3569, var2), arg0);
        }
    }

    @ObfuscatedName("mh.be(ZI)V")
    public void method5516(boolean arg0) {
        class397 var2 = this.field3567.method6631(0, this.field3569);
        class474 var3 = var2.method6886();
        this.method5552(this.field3567.method6652((Integer) var3.field4904, this.field3578), arg0);
    }

    @ObfuscatedName("mh.bh(ZI)V")
    public void method5664(boolean arg0) {
        class397 var2 = this.field3567.method6631(0, this.field3569);
        class474 var3 = var2.method6886();
        this.method5552(this.field3567.method6652((Integer) var3.field4904, this.field3578 + this.field3576), arg0);
    }

    @ObfuscatedName("mh.bp(IIZZI)V")
    public void method5582(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3565) {
            int var7 = this.field3577 + arg0;
            int var8 = this.field3578 + arg1;
            class474 var9 = this.method5573();
            var6 = this.field3567.method6652(var7 - (Integer) var9.field4904, var8 - (Integer) var9.field4905);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3575 = 1;
            class474 var10 = this.method5549(var6);
            class474 var11 = this.method5549(this.field3555);
            this.method5548(var11, var10);
        } else if (arg2) {
            this.field3575 = 1;
            class474 var12 = this.method5549(var6);
            this.method5503((Integer) var12.field4904, (Integer) var12.field4905);
            this.field3555 = (Integer) var12.field4904;
        } else if (arg3) {
            this.method5503(this.field3555, var6);
        } else {
            if (this.field3572 <= 0 || this.field3555 != var6) {
                this.field3575 = 0;
                this.method5503(var6, var6);
                this.field3555 = var6;
            } else if (this.field3580 == this.field3569) {
                this.field3575 = 1;
                class474 var13 = this.method5549(var6);
                this.method5503((Integer) var13.field4904, (Integer) var13.field4905);
            } else {
                this.field3575 = 2;
                class474 var14 = this.method5550(var6);
                this.method5503((Integer) var14.field4904, (Integer) var14.field4905);
            }
            this.field3572 = 25;
        }
    }

    @ObfuscatedName("mh.bw(III)V")
    public void method5519(int arg0, int arg1) {
        if (!this.field3565 || !this.method5530()) {
            return;
        }
        int var3 = this.field3577 + arg0;
        int var4 = this.field3578 + arg1;
        class474 var5 = this.method5573();
        int var6 = this.field3567.method6652(var3 - (Integer) var5.field4904, var4 - (Integer) var5.field4905);
        switch(this.field3575) {
            case 0:
                this.method5503(this.field3580, var6);
                break;
            case 1:
                class474 var9 = this.method5549(this.field3555);
                class474 var10 = this.method5549(var6);
                this.method5548(var9, var10);
                break;
            case 2:
                class474 var7 = this.method5550(this.field3555);
                class474 var8 = this.method5550(var6);
                this.method5548(var7, var8);
        }
    }

    @ObfuscatedName("mh.bi(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5520(Clipboard arg0) {
        class397 var2 = this.field3567.method6631(this.field3580, this.field3569);
        if (!var2.method6876()) {
            String var3 = var2.method6874();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("mh.bk(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5521(Clipboard arg0) {
        if (this.method5546()) {
            this.method5520(arg0);
            this.method5609();
        }
    }

    @ObfuscatedName("mh.bv(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5607(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5547((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5609();
            class394 var4 = this.field3567.method6633(var3, this.field3569, this.field3573);
            this.method5503(var4.method6768(), var4.method6768());
            this.method5740();
            this.method5556();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("mh.bz(B)V")
    public void method5523() {
        this.field3578 = Math.max(0, this.field3578 - this.field3567.method6643());
    }

    @ObfuscatedName("mh.bm(I)V")
    public void method5687() {
        int var1 = Math.max(0, this.field3567.method6644() - this.field3576);
        this.field3578 = Math.min(var1, this.field3578 + this.field3567.method6643());
    }

    @ObfuscatedName("mh.br(Lmo;B)V")
    public void method5694(class322 arg0) {
        this.field3579 = arg0;
    }

    @ObfuscatedName("mh.bu(Lmo;I)V")
    public void method5526(class322 arg0) {
        this.field3553 = arg0;
    }

    @ObfuscatedName("mh.by(B)Lpk;")
    public class393 method5586() {
        return this.field3567;
    }

    @ObfuscatedName("mh.bt(I)Lpk;")
    public class393 method5528() {
        return this.field3561;
    }

    @ObfuscatedName("mh.bl(B)Lpw;")
    public class397 method5529() {
        return this.field3567.method6631(this.field3580, this.field3569);
    }

    @ObfuscatedName("mh.cs(I)Z")
    public boolean method5530() {
        return this.field3568;
    }

    @ObfuscatedName("mh.cu(I)Z")
    public boolean method5579() {
        return this.field3563;
    }

    @ObfuscatedName("mh.ca(I)Z")
    public boolean method5532() {
        return this.method5530() && this.field3564 % 60 < 30;
    }

    @ObfuscatedName("mh.cf(B)I")
    public int method5662() {
        return this.field3569;
    }

    @ObfuscatedName("mh.cw(I)I")
    public int method5655() {
        return this.field3580;
    }

    @ObfuscatedName("mh.ch(I)Z")
    public boolean method5661() {
        return this.field3565;
    }

    @ObfuscatedName("mh.cp(I)I")
    public int method5580() {
        return this.field3577;
    }

    @ObfuscatedName("mh.cy(B)I")
    public int method5537() {
        return this.field3578;
    }

    @ObfuscatedName("mh.cd(B)I")
    public int method5538() {
        return this.field3567.method6646();
    }

    @ObfuscatedName("mh.cv(I)I")
    public int method5593() {
        return this.field3567.method6655();
    }

    @ObfuscatedName("mh.cr(I)I")
    public int method5540() {
        return this.field3574;
    }

    @ObfuscatedName("mh.cm(I)I")
    public int method5541() {
        return this.field3566;
    }

    @ObfuscatedName("mh.cg(B)I")
    public int method5652() {
        return this.field3567.method6661();
    }

    @ObfuscatedName("mh.ci(I)I")
    public int method5728() {
        return this.field3570;
    }

    @ObfuscatedName("mh.cb(I)I")
    public int method5544() {
        return this.field3567.method6734();
    }

    @ObfuscatedName("mh.cc(I)Z")
    public boolean method5545() {
        return this.method5593() > 1;
    }

    @ObfuscatedName("mh.ck(I)Z")
    public boolean method5546() {
        return this.field3580 != this.field3569;
    }

    @ObfuscatedName("mh.cq(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5547(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5557(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("mh.ce(Lsf;Lsf;I)V")
    public void method5548(class474 arg0, class474 arg1) {
        if ((Integer) arg1.field4904 < (Integer) arg0.field4904) {
            this.method5503((Integer) arg0.field4905, (Integer) arg1.field4904);
        } else {
            this.method5503((Integer) arg0.field4904, (Integer) arg1.field4905);
        }
    }

    @ObfuscatedName("mh.cj(II)Lsf;")
    public class474 method5549(int arg0) {
        int var2 = this.field3567.method6622();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5555(this.field3567.method6618(var5 - 1).field4439)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5555(this.field3567.method6618(var6).field4439)) {
                var4 = var6;
                break;
            }
        }
        return new class474(var3, var4);
    }

    @ObfuscatedName("mh.cl(IB)Lsf;")
    public class474 method5550(int arg0) {
        int var2 = this.field3567.method6622();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3567.method6618(var5 - 1).field4439 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3567.method6618(var6).field4439 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class474(var3, var4);
    }

    @ObfuscatedName("mh.cn(B)Z")
    public boolean method5740() {
        if (!this.method5661()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3567.method6622() > this.field3574) {
            this.field3567.method6638(this.field3574, this.field3567.method6622());
            var1 = true;
        }
        int var2 = this.method5593();
        if (this.field3567.method6675() > var2) {
            int var3 = this.field3567.method6645(0, var2) - 1;
            this.field3567.method6638(var3, this.field3567.method6622());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3569;
            int var5 = this.field3580;
            int var6 = this.field3567.method6622();
            if (this.field3569 > var6) {
                var4 = var6;
            }
            if (this.field3580 > var6) {
                var5 = var6;
            }
            this.method5503(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("mh.ct(IZI)V")
    public void method5552(int arg0, boolean arg1) {
        if (arg1) {
            this.method5503(this.field3580, arg0);
        } else {
            this.method5503(arg0, arg0);
        }
    }

    @ObfuscatedName("mh.cx(I)I")
    public int method5553() {
        return this.field3576 / this.field3567.method6643();
    }

    @ObfuscatedName("mh.co(B)V")
    public void method5554() {
        class397 var1 = this.field3567.method6631(0, this.field3569);
        class474 var2 = var1.method6886();
        int var3 = this.field3567.method6643();
        int var4 = (Integer) var2.field4904 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4905 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3577;
        int var9 = this.field3571 + var8;
        int var10 = this.field3578;
        int var11 = this.field3576 + var10;
        int var12 = this.field3577;
        int var13 = this.field3578;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3571;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3576;
        }
        this.method5761(var12, var13);
    }

    @ObfuscatedName("mh.cz(IB)Z")
    public boolean method5555(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("mh.dd(I)V")
    public void method5556() {
        if (this.field3579 != null) {
            this.field3579.method2530();
        }
    }

    @ObfuscatedName("mh.dl(II)Z")
    public boolean method5557(int arg0) {
        switch(this.field3570) {
            case 1:
                return Statics.method3784((char) arg0);
            case 2:
                return class385.method6499((char) arg0);
            case 3:
                return class385.method3055((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class385.method3055(var2)) {
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

    @ObfuscatedName("mh.dm(B)Lsf;")
    public class474 method5573() {
        int var1 = this.field3567.method6650(this.field3571);
        int var2 = this.field3567.method6681(this.field3576);
        return new class474(var1, var2);
    }
}
