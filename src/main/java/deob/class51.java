package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("am")
public class class51 extends class52 {

    @ObfuscatedName("am.p")
    public AudioFormat field1087;

    @ObfuscatedName("am.l")
    public SourceDataLine field1086;

    @ObfuscatedName("am.d")
    public int field1088;

    @ObfuscatedName("am.x")
    public byte[] field1089;

    @ObfuscatedName("am.p(Ljava/awt/Component;)V")
    public void method942(Component arg0) {
        this.field1087 = new AudioFormat((float) Statics.field1099, 16, Statics.field1368 ? 2 : 1, true, false);
        this.field1089 = new byte[0x100 << (Statics.field1368 ? 2 : 1)];
    }

    @ObfuscatedName("am.l(I)V")
    public void method943(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1087, arg0 << (Statics.field1368 ? 2 : 1));
            this.field1086 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1086.open();
            this.field1086.start();
            this.field1088 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1086 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method943(var17);
        }
    }

    @ObfuscatedName("am.d()I")
    public int method952() {
        return this.field1088 - (this.field1086.available() >> (Statics.field1368 ? 2 : 1));
    }

    @ObfuscatedName("am.x()V")
    public void method945() {
        int var1 = 256;
        if (Statics.field1368) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1094[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1089[var2 * 2] = (byte) (var3 >> 8);
            this.field1089[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1086.write(this.field1089, 0, var1 << 1);
    }

    @ObfuscatedName("am.o()V")
    public void method946() {
        if (this.field1086 != null) {
            this.field1086.close();
            this.field1086 = null;
        }
    }

    @ObfuscatedName("am.a()V")
    public void method947() {
        this.field1086.flush();
    }
}
