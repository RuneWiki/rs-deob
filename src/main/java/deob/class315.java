package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("mz")
public class class315 {

    @ObfuscatedName("mz.ar")
    public class380 field3537 = new class380();

    @ObfuscatedName("mz.am")
    public class380 field3536 = new class380();

    @ObfuscatedName("mz.as")
    public boolean field3531 = false;

    @ObfuscatedName("mz.aj")
    public boolean field3532 = true;

    @ObfuscatedName("mz.ak")
    public int field3533 = 0;

    @ObfuscatedName("mz.az")
    public boolean field3534 = false;

    @ObfuscatedName("mz.ad")
    public int field3535 = 0;

    @ObfuscatedName("mz.ae")
    public int field3547 = 0;

    @ObfuscatedName("mz.ap")
    public int field3529 = 0;

    @ObfuscatedName("mz.by")
    public int field3538 = 0;

    @ObfuscatedName("mz.bb")
    public int field3539 = 0;

    @ObfuscatedName("mz.bi")
    public int field3540 = 0;

    @ObfuscatedName("mz.be")
    public int field3541 = 0;

    @ObfuscatedName("mz.bk")
    public int field3542 = Integer.MAX_VALUE;

    @ObfuscatedName("mz.bx")
    public int field3543 = Integer.MAX_VALUE;

    @ObfuscatedName("mz.bo")
    public int field3524 = 0;

    @ObfuscatedName("mz.bz")
    public int field3545 = 0;

    @ObfuscatedName("mz.bm")
    public int field3546 = 0;

    @ObfuscatedName("mz.bd")
    public int field3525 = 0;

    @ObfuscatedName("mz.bt")
    public class309 field3548;

    @ObfuscatedName("mz.bj")
    public class309 field3549;

    public class315() {
        this.field3537.method6628(1);
        this.field3536.method6628(1);
    }

    @ObfuscatedName("mz.af(B)V")
    public void method5688() {
        this.field3533 = (this.field3533 + 1) % 60;
        if (this.field3541 > 0) {
            this.field3541--;
        }
    }

    @ObfuscatedName("mz.an(ZI)Z")
    public boolean method5492(boolean arg0) {
        boolean var2 = arg0 && this.field3532;
        boolean var3 = this.field3531 != var2;
        this.field3531 = var2;
        if (!this.field3531) {
            this.method5516(this.field3538, this.field3538);
        }
        return var3;
    }

    @ObfuscatedName("mz.aw(ZI)V")
    public void method5493(boolean arg0) {
        this.field3532 = arg0;
        this.field3531 = arg0 && this.field3531;
    }

    @ObfuscatedName("mz.ac(Ljava/lang/String;I)Z")
    public boolean method5494(String arg0) {
        String var2 = this.field3537.method6623();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5560(arg0);
        this.field3537.method6635(var3);
        this.method5501(this.field3546, this.field3525);
        this.method5564();
        this.method5569();
        return true;
    }

    @ObfuscatedName("mz.au(Ljava/lang/String;B)Z")
    public boolean method5495(String arg0) {
        this.field3536.method6635(arg0);
        return true;
    }

    @ObfuscatedName("mz.ab(Lou;I)Z")
    public boolean method5534(class383 arg0) {
        boolean var2 = !this.field3534;
        this.field3537.method6731(arg0);
        this.field3536.method6731(arg0);
        this.field3534 = true;
        boolean var3 = var2 | this.method5501(this.field3546, this.field3525);
        boolean var4 = var3 | this.method5516(this.field3539, this.field3538);
        if (this.method5564()) {
            this.method5569();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("mz.aq(IIB)Z")
    public boolean method5497(int arg0, int arg1) {
        boolean var3 = this.field3524 != arg0 || this.field3545 != arg1;
        this.field3524 = arg0;
        this.field3545 = arg1;
        return var3 | this.method5501(this.field3546, this.field3525);
    }

    @ObfuscatedName("mz.al(II)Z")
    public boolean method5498(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3537.method6737();
        this.field3537.method6678(arg0);
        this.field3536.method6678(arg0);
        if (this.method5564()) {
            this.method5569();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("mz.at(IB)Z")
    public boolean method5741(int arg0) {
        this.field3537.method6619(arg0);
        if (this.method5564()) {
            this.method5569();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mz.aa(II)Z")
    public boolean method5500(int arg0) {
        this.field3543 = arg0;
        if (this.method5564()) {
            this.method5569();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mz.ay(IIB)Z")
    public boolean method5501(int arg0, int arg1) {
        if (!this.method5548()) {
            this.field3546 = arg0;
            this.field3525 = arg1;
            return false;
        }
        int var3 = this.field3546;
        int var4 = this.field3525;
        int var5 = Math.max(0, this.field3537.method6641() - this.field3524 + 2);
        int var6 = Math.max(0, this.field3537.method6642() - this.field3545 + 1);
        this.field3546 = Math.max(0, Math.min(var5, arg0));
        this.field3525 = Math.max(0, Math.min(var6, arg1));
        return this.field3546 != var3 || this.field3525 != var4;
    }

    @ObfuscatedName("mz.ao(III)Z")
    public boolean method5502(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3537.method6629(arg0, arg1) : false;
    }

    @ObfuscatedName("mz.ax(II)V")
    public void method5503(int arg0) {
        this.field3537.method6630(arg0);
    }

    @ObfuscatedName("mz.ai(II)V")
    public void method5491(int arg0) {
        this.field3535 = arg0;
    }

    @ObfuscatedName("mz.ag(II)V")
    public void method5505(int arg0) {
        this.field3537.method6628(arg0);
    }

    @ObfuscatedName("mz.ah(IS)V")
    public void method5506(int arg0) {
        this.field3537.method6656(arg0);
    }

    @ObfuscatedName("mz.av(IB)Z")
    public boolean method5507(int arg0) {
        this.field3529 = arg0;
        String var2 = this.field3537.method6623();
        int var3 = var2.length();
        String var4 = this.method5560(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3537.method6635(var4);
        this.method5501(this.field3546, this.field3525);
        this.method5564();
        this.method5569();
        return true;
    }

    @ObfuscatedName("mz.ar(I)V")
    public void method5620() {
        this.field3534 = false;
    }

    @ObfuscatedName("mz.am(II)Z")
    public boolean method5509(int arg0) {
        if (this.method5568(arg0)) {
            this.method5514();
            class381 var2 = this.field3537.method6665((char) arg0, this.field3538, this.field3542);
            this.method5516(var2.method6754(), var2.method6754());
            this.method5564();
            this.method5569();
        }
        return true;
    }

    @ObfuscatedName("mz.as(I)V")
    public void method5612() {
        if (!this.method5514() && this.field3538 > 0) {
            int var1 = this.field3537.method6637(this.field3538 - 1);
            this.method5569();
            this.method5516(var1, var1);
        }
    }

    @ObfuscatedName("mz.aj(B)V")
    public void method5572() {
        if (!this.method5514() && this.field3538 < this.field3537.method6622()) {
            int var1 = this.field3537.method6637(this.field3538);
            this.method5569();
            this.method5516(var1, var1);
        }
    }

    @ObfuscatedName("mz.ak(I)V")
    public void method5695() {
        if (!this.method5514() && this.field3538 > 0) {
            class462 var1 = this.method5562(this.field3538 - 1);
            int var2 = this.field3537.method6638((Integer) var1.field4887, this.field3538);
            this.method5569();
            this.method5516(var2, var2);
        }
    }

    @ObfuscatedName("mz.az(I)V")
    public void method5747() {
        if (!this.method5514() && this.field3538 < this.field3537.method6622()) {
            class462 var1 = this.method5562(this.field3538);
            int var2 = this.field3537.method6638(this.field3538, (Integer) var1.field4888);
            this.method5569();
            this.method5516(var2, var2);
        }
    }

    @ObfuscatedName("mz.ad(I)Z")
    public boolean method5514() {
        if (this.method5559()) {
            int var1 = this.field3537.method6638(this.field3539, this.field3538);
            this.method5569();
            this.method5516(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mz.ae(B)V")
    public void method5757() {
        this.method5516(0, this.field3537.method6622());
    }

    @ObfuscatedName("mz.ap(IIB)Z")
    public boolean method5516(int arg0, int arg1) {
        if (!this.method5548()) {
            this.field3539 = arg0;
            this.field3538 = arg1;
            return false;
        }
        if (arg0 > this.field3537.method6622()) {
            arg0 = this.field3537.method6622();
        }
        if (arg1 > this.field3537.method6622()) {
            arg1 = this.field3537.method6622();
        }
        boolean var3 = this.field3539 != arg0 || this.field3538 != arg1;
        this.field3539 = arg0;
        if (this.field3538 != arg1) {
            this.field3538 = arg1;
            this.field3533 = 0;
            this.method5567();
        }
        if (var3 && this.field3549 != null) {
            this.field3549.method2545();
        }
        return var3;
    }

    @ObfuscatedName("mz.by(ZI)V")
    public void method5513(boolean arg0) {
        class462 var2 = this.method5563(this.field3538);
        this.method5565((Integer) var2.field4887, arg0);
    }

    @ObfuscatedName("mz.bb(ZI)V")
    public void method5622(boolean arg0) {
        class462 var2 = this.method5563(this.field3538);
        this.method5565((Integer) var2.field4888, arg0);
    }

    @ObfuscatedName("mz.bi(ZB)V")
    public void method5519(boolean arg0) {
        this.method5565(0, arg0);
    }

    @ObfuscatedName("mz.be(ZB)V")
    public void method5627(boolean arg0) {
        this.method5565(this.field3537.method6622(), arg0);
    }

    @ObfuscatedName("mz.bk(ZI)V")
    public void method5521(boolean arg0) {
        if (this.method5559() && !arg0) {
            this.method5565(Math.min(this.field3539, this.field3538), arg0);
        } else if (this.field3538 > 0) {
            this.method5565(this.field3538 - 1, arg0);
        }
    }

    @ObfuscatedName("mz.bx(ZI)V")
    public void method5522(boolean arg0) {
        if (this.method5559() && !arg0) {
            this.method5565(Math.max(this.field3539, this.field3538), arg0);
        } else if (this.field3538 < this.field3537.method6622()) {
            this.method5565(this.field3538 + 1, arg0);
        }
    }

    @ObfuscatedName("mz.bo(ZI)V")
    public void method5756(boolean arg0) {
        if (this.field3538 > 0) {
            class462 var2 = this.method5562(this.field3538 - 1);
            this.method5565((Integer) var2.field4887, arg0);
        }
    }

    @ObfuscatedName("mz.bz(ZB)V")
    public void method5524(boolean arg0) {
        if (this.field3538 < this.field3537.method6622()) {
            class462 var2 = this.method5562(this.field3538 + 1);
            this.method5565((Integer) var2.field4888, arg0);
        }
    }

    @ObfuscatedName("mz.bm(ZB)V")
    public void method5525(boolean arg0) {
        if (this.field3538 > 0) {
            this.method5565(this.field3537.method6640(this.field3538, -1), arg0);
        }
    }

    @ObfuscatedName("mz.bd(ZB)V")
    public void method5526(boolean arg0) {
        if (this.field3538 < this.field3537.method6622()) {
            this.method5565(this.field3537.method6640(this.field3538, 1), arg0);
        }
    }

    @ObfuscatedName("mz.bt(ZB)V")
    public void method5527(boolean arg0) {
        if (this.field3538 > 0) {
            int var2 = this.method5566();
            this.method5565(this.field3537.method6640(this.field3538, -var2), arg0);
        }
    }

    @ObfuscatedName("mz.bj(ZS)V")
    public void method5512(boolean arg0) {
        if (this.field3538 < this.field3537.method6622()) {
            int var2 = this.method5566();
            this.method5565(this.field3537.method6640(this.field3538, var2), arg0);
        }
    }

    @ObfuscatedName("mz.bn(ZI)V")
    public void method5529(boolean arg0) {
        class384 var2 = this.field3537.method6699(0, this.field3538);
        class462 var3 = var2.method6862();
        this.method5565(this.field3537.method6639((Integer) var3.field4887, this.field3525), arg0);
    }

    @ObfuscatedName("mz.bs(ZI)V")
    public void method5515(boolean arg0) {
        class384 var2 = this.field3537.method6699(0, this.field3538);
        class462 var3 = var2.method6862();
        this.method5565(this.field3537.method6639((Integer) var3.field4887, this.field3545 + this.field3525), arg0);
    }

    @ObfuscatedName("mz.br(IIZZI)V")
    public void method5531(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3534) {
            int var7 = this.field3546 + arg0;
            int var8 = this.field3525 + arg1;
            class462 var9 = this.method5571();
            var6 = this.field3537.method6639(var7 - (Integer) var9.field4887, var8 - (Integer) var9.field4888);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3547 = 1;
            class462 var10 = this.method5562(var6);
            class462 var11 = this.method5562(this.field3540);
            this.method5561(var11, var10);
        } else if (arg2) {
            this.field3547 = 1;
            class462 var12 = this.method5562(var6);
            this.method5516((Integer) var12.field4887, (Integer) var12.field4888);
            this.field3540 = (Integer) var12.field4887;
        } else if (arg3) {
            this.method5516(this.field3540, var6);
        } else {
            if (this.field3541 <= 0 || this.field3540 != var6) {
                this.field3547 = 0;
                this.method5516(var6, var6);
                this.field3540 = var6;
            } else if (this.field3539 == this.field3538) {
                this.field3547 = 1;
                class462 var13 = this.method5562(var6);
                this.method5516((Integer) var13.field4887, (Integer) var13.field4888);
            } else {
                this.field3547 = 2;
                class462 var14 = this.method5563(var6);
                this.method5516((Integer) var14.field4887, (Integer) var14.field4888);
            }
            this.field3541 = 25;
        }
    }

    @ObfuscatedName("mz.bg(III)V")
    public void method5520(int arg0, int arg1) {
        if (!this.field3534 || !this.method5543()) {
            return;
        }
        int var3 = this.field3546 + arg0;
        int var4 = this.field3525 + arg1;
        class462 var5 = this.method5571();
        int var6 = this.field3537.method6639(var3 - (Integer) var5.field4887, var4 - (Integer) var5.field4888);
        switch(this.field3547) {
            case 0:
                this.method5516(this.field3539, var6);
                break;
            case 1:
                class462 var9 = this.method5562(this.field3540);
                class462 var10 = this.method5562(var6);
                this.method5561(var9, var10);
                break;
            case 2:
                class462 var7 = this.method5563(this.field3540);
                class462 var8 = this.method5563(var6);
                this.method5561(var7, var8);
        }
    }

    @ObfuscatedName("mz.bu(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5533(Clipboard arg0) {
        class384 var2 = this.field3537.method6699(this.field3539, this.field3538);
        if (!var2.method6863()) {
            String var3 = var2.method6872();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("mz.bf(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5678(Clipboard arg0) {
        if (this.method5559()) {
            this.method5533(arg0);
            this.method5514();
        }
    }

    @ObfuscatedName("mz.bq(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5535(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5560((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5514();
            class381 var4 = this.field3537.method6633(var3, this.field3538, this.field3542);
            this.method5516(var4.method6754(), var4.method6754());
            this.method5564();
            this.method5569();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("mz.ba(I)V")
    public void method5679() {
        this.field3525 = Math.max(0, this.field3525 - this.field3537.method6744());
    }

    @ObfuscatedName("mz.bv(B)V")
    public void method5683() {
        int var1 = Math.max(0, this.field3537.method6642() - this.field3545);
        this.field3525 = Math.min(var1, this.field3525 + this.field3537.method6744());
    }

    @ObfuscatedName("mz.bl(Llx;I)V")
    public void method5537(class309 arg0) {
        this.field3548 = arg0;
    }

    @ObfuscatedName("mz.bp(Llx;I)V")
    public void method5663(class309 arg0) {
        this.field3549 = arg0;
    }

    @ObfuscatedName("mz.bc(I)Loq;")
    public class380 method5540() {
        return this.field3537;
    }

    @ObfuscatedName("mz.bh(B)Loq;")
    public class380 method5541() {
        return this.field3536;
    }

    @ObfuscatedName("mz.bw(I)Loa;")
    public class384 method5542() {
        return this.field3537.method6699(this.field3539, this.field3538);
    }

    @ObfuscatedName("mz.ce(I)Z")
    public boolean method5543() {
        return this.field3531;
    }

    @ObfuscatedName("mz.ci(I)Z")
    public boolean method5544() {
        return this.field3532;
    }

    @ObfuscatedName("mz.cs(B)Z")
    public boolean method5545() {
        return this.method5543() && this.field3533 % 60 < 30;
    }

    @ObfuscatedName("mz.cc(I)I")
    public int method5546() {
        return this.field3538;
    }

    @ObfuscatedName("mz.cn(I)I")
    public int method5547() {
        return this.field3539;
    }

    @ObfuscatedName("mz.ca(I)Z")
    public boolean method5548() {
        return this.field3534;
    }

    @ObfuscatedName("mz.cu(I)I")
    public int method5605() {
        return this.field3546;
    }

    @ObfuscatedName("mz.ck(I)I")
    public int method5704() {
        return this.field3525;
    }

    @ObfuscatedName("mz.cq(I)I")
    public int method5551() {
        return this.field3537.method6737();
    }

    @ObfuscatedName("mz.cm(I)I")
    public int method5734() {
        return this.field3537.method6647();
    }

    @ObfuscatedName("mz.cf(I)I")
    public int method5504() {
        return this.field3543;
    }

    @ObfuscatedName("mz.cl(B)I")
    public int method5554() {
        return this.field3535;
    }

    @ObfuscatedName("mz.cg(I)I")
    public int method5553() {
        return this.field3537.method6692();
    }

    @ObfuscatedName("mz.cr(I)I")
    public int method5556() {
        return this.field3529;
    }

    @ObfuscatedName("mz.cy(B)I")
    public int method5557() {
        return this.field3537.method6649();
    }

    @ObfuscatedName("mz.cx(I)Z")
    public boolean method5558() {
        return this.method5734() > 1;
    }

    @ObfuscatedName("mz.cv(I)Z")
    public boolean method5559() {
        return this.field3539 != this.field3538;
    }

    @ObfuscatedName("mz.cb(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5560(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5568(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("mz.co(Lrg;Lrg;I)V")
    public void method5561(class462 arg0, class462 arg1) {
        if ((Integer) arg1.field4887 < (Integer) arg0.field4887) {
            this.method5516((Integer) arg0.field4888, (Integer) arg1.field4887);
        } else {
            this.method5516((Integer) arg0.field4887, (Integer) arg1.field4888);
        }
    }

    @ObfuscatedName("mz.cz(IB)Lrg;")
    public class462 method5562(int arg0) {
        int var2 = this.field3537.method6622();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5733(this.field3537.method6618(var5 - 1).field4429)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5733(this.field3537.method6618(var6).field4429)) {
                var4 = var6;
                break;
            }
        }
        return new class462(var3, var4);
    }

    @ObfuscatedName("mz.cw(II)Lrg;")
    public class462 method5563(int arg0) {
        int var2 = this.field3537.method6622();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3537.method6618(var5 - 1).field4429 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3537.method6618(var6).field4429 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class462(var3, var4);
    }

    @ObfuscatedName("mz.cj(B)Z")
    public boolean method5564() {
        if (!this.method5548()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3537.method6622() > this.field3543) {
            this.field3537.method6638(this.field3543, this.field3537.method6622());
            var1 = true;
        }
        int var2 = this.method5734();
        if (this.field3537.method6644() > var2) {
            int var3 = this.field3537.method6640(0, var2) - 1;
            this.field3537.method6638(var3, this.field3537.method6622());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3538;
            int var5 = this.field3539;
            int var6 = this.field3537.method6622();
            if (this.field3538 > var6) {
                var4 = var6;
            }
            if (this.field3539 > var6) {
                var5 = var6;
            }
            this.method5516(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("mz.ch(IZB)V")
    public void method5565(int arg0, boolean arg1) {
        if (arg1) {
            this.method5516(this.field3539, arg0);
        } else {
            this.method5516(arg0, arg0);
        }
    }

    @ObfuscatedName("mz.ct(I)I")
    public int method5566() {
        return this.field3545 / this.field3537.method6744();
    }

    @ObfuscatedName("mz.cp(B)V")
    public void method5567() {
        class384 var1 = this.field3537.method6699(0, this.field3538);
        class462 var2 = var1.method6862();
        int var3 = this.field3537.method6744();
        int var4 = (Integer) var2.field4887 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4888 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3546;
        int var9 = this.field3524 + var8;
        int var10 = this.field3525;
        int var11 = this.field3545 + var10;
        int var12 = this.field3546;
        int var13 = this.field3525;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3524;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3545;
        }
        this.method5501(var12, var13);
    }

    @ObfuscatedName("mz.cd(II)Z")
    public boolean method5733(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("mz.dm(I)V")
    public void method5569() {
        if (this.field3548 != null) {
            this.field3548.method2545();
        }
    }

    @ObfuscatedName("mz.dw(IB)Z")
    public boolean method5568(int arg0) {
        switch(this.field3529) {
            case 1:
                return class372.method1943((char) arg0);
            case 2:
                return class372.method3016((char) arg0);
            case 3:
                return class372.method3077((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class372.method3077(var2)) {
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

    @ObfuscatedName("mz.dc(I)Lrg;")
    public class462 method5571() {
        int var1 = this.field3537.method6739(this.field3524);
        int var2 = this.field3537.method6741(this.field3545);
        return new class462(var1, var2);
    }
}
