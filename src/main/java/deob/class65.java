package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("be")
public class class65 extends class52 {

    @ObfuscatedName("be.y")
    public AudioFormat field1215;

    @ObfuscatedName("be.k")
    public SourceDataLine field1213;

    @ObfuscatedName("be.ab")
    public int field1214;

    @ObfuscatedName("be.am")
    public byte[] field1216;

    @ObfuscatedName("be.y(Ljava/awt/Component;)V")
    public void method984(Component arg0) {
        this.field1215 = new AudioFormat((float) Statics.field1126, 16, Statics.field1125 ? 2 : 1, true, false);
        this.field1216 = new byte[0x100 << (Statics.field1125 ? 2 : 1)];
    }

    @ObfuscatedName("be.k(I)V")
    public void method994(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1215, arg0 << (Statics.field1125 ? 2 : 1));
            this.field1213 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1213.open();
            this.field1213.start();
            this.field1214 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1213 = null;
                throw var11;
            } else {
                this.method994(class118.method2078(arg0));
            }
        }
    }

    @ObfuscatedName("be.g()I")
    public int method985() {
        return this.field1214 - (this.field1213.available() >> (Statics.field1125 ? 2 : 1));
    }

    @ObfuscatedName("be.n()V")
    public void method999() {
        int var1 = 256;
        if (Statics.field1125) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1111[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1216[var2 * 2] = (byte) (var3 >> 8);
            this.field1216[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1213.write(this.field1216, 0, var1 << 1);
    }

    @ObfuscatedName("be.t()V")
    public void method988() {
        if (this.field1213 != null) {
            this.field1213.close();
            this.field1213 = null;
        }
    }

    @ObfuscatedName("be.e()V")
    public void method989() {
        this.field1213.flush();
    }
}
