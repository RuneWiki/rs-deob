package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bp")
public class class60 extends class58 {

    @ObfuscatedName("bp.ai")
    public AudioFormat field1079;

    @ObfuscatedName("bp.ad")
    public SourceDataLine field1076;

    @ObfuscatedName("bp.aa")
    public int field1077;

    @ObfuscatedName("bp.ao")
    public byte[] field1078;

    @ObfuscatedName("bp.j(Ljava/awt/Component;I)V")
    public void method982(Component arg0) {
        this.field1079 = new AudioFormat((float) Statics.field1058, 16, Statics.field1053 ? 2 : 1, true, false);
        this.field1078 = new byte[0x100 << (Statics.field1053 ? 2 : 1)];
    }

    @ObfuscatedName("bp.w(II)V")
    public void method983(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1079, arg0 << (Statics.field1053 ? 2 : 1));
            this.field1076 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1076.open();
            this.field1076.start();
            this.field1077 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1076 = null;
                throw var11;
            } else {
                this.method983(class158.method1924(arg0));
            }
        }
    }

    @ObfuscatedName("bp.p(I)I")
    public int method984() {
        return this.field1077 - (this.field1076.available() >> (Statics.field1053 ? 2 : 1));
    }

    @ObfuscatedName("bp.o()V")
    public void method973() {
        int var1 = 256;
        if (Statics.field1053) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1052[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1078[var2 * 2] = (byte) (var3 >> 8);
            this.field1078[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1076.write(this.field1078, 0, var1 << 1);
    }

    @ObfuscatedName("bp.i(I)V")
    public void method1004() {
        if (this.field1076 != null) {
            this.field1076.close();
            this.field1076 = null;
        }
    }

    @ObfuscatedName("bp.z(I)V")
    public void method987() {
        this.field1076.flush();
    }
}
