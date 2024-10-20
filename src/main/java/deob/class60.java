package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bq")
public class class60 extends class58 {

    @ObfuscatedName("bq.aj")
    public AudioFormat field1084;

    @ObfuscatedName("bq.ae")
    public SourceDataLine field1085;

    @ObfuscatedName("bq.au")
    public int field1086;

    @ObfuscatedName("bq.aa")
    public byte[] field1087;

    @ObfuscatedName("bq.v(Ljava/awt/Component;I)V")
    public void method1037(Component arg0) {
        this.field1084 = new AudioFormat((float) Statics.field1072, 16, Statics.field1047 ? 2 : 1, true, false);
        this.field1087 = new byte[0x100 << (Statics.field1047 ? 2 : 1)];
    }

    @ObfuscatedName("bq.d(II)V")
    public void method1046(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1084, arg0 << (Statics.field1047 ? 2 : 1));
            this.field1085 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1085.open();
            this.field1085.start();
            this.field1086 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1085 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1046(var17);
        }
    }

    @ObfuscatedName("bq.o(I)I")
    public int method1047() {
        return this.field1086 - (this.field1085.available() >> (Statics.field1047 ? 2 : 1));
    }

    @ObfuscatedName("bq.q()V")
    public void method1048() {
        int var1 = 256;
        if (Statics.field1047) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1048[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1087[var2 * 2] = (byte) (var3 >> 8);
            this.field1087[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1085.write(this.field1087, 0, var1 << 1);
    }

    @ObfuscatedName("bq.i(I)V")
    public void method1056() {
        if (this.field1085 != null) {
            this.field1085.close();
            this.field1085 = null;
        }
    }

    @ObfuscatedName("bq.x(I)V")
    public void method1050() {
        this.field1085.flush();
    }
}
