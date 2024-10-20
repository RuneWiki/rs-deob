package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bt")
public class class64 extends class51 {

    @ObfuscatedName("bt.l")
    public AudioFormat field1179;

    @ObfuscatedName("bt.y")
    public SourceDataLine field1180;

    @ObfuscatedName("bt.aw")
    public int field1181;

    @ObfuscatedName("bt.az")
    public byte[] field1182;

    @ObfuscatedName("bt.l(Ljava/awt/Component;)V")
    public void method925(Component arg0) {
        this.field1179 = new AudioFormat((float) Statics.field1086, 16, Statics.field2900 ? 2 : 1, true, false);
        this.field1182 = new byte[0x100 << (Statics.field2900 ? 2 : 1)];
    }

    @ObfuscatedName("bt.y(I)V")
    public void method944(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1179, arg0 << (Statics.field2900 ? 2 : 1));
            this.field1180 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1180.open();
            this.field1180.start();
            this.field1181 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1180 = null;
                throw var11;
            } else {
                this.method944(class115.method506(arg0));
            }
        }
    }

    @ObfuscatedName("bt.g()I")
    public int method922() {
        return this.field1181 - (this.field1180.available() >> (Statics.field2900 ? 2 : 1));
    }

    @ObfuscatedName("bt.j()V")
    public void method929() {
        int var1 = 256;
        if (Statics.field2900) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1072[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1182[var2 * 2] = (byte) (var3 >> 8);
            this.field1182[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1180.write(this.field1182, 0, var1 << 1);
    }

    @ObfuscatedName("bt.w()V")
    public void method926() {
        if (this.field1180 != null) {
            this.field1180.close();
            this.field1180 = null;
        }
    }

    @ObfuscatedName("bt.c()V")
    public void method928() {
        this.field1180.flush();
    }
}
