package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ap")
public class class51 extends class52 {

    @ObfuscatedName("ap.p")
    public AudioFormat field1090;

    @ObfuscatedName("ap.i")
    public SourceDataLine field1091;

    @ObfuscatedName("ap.o")
    public int field1092;

    @ObfuscatedName("ap.n")
    public byte[] field1093;

    @ObfuscatedName("ap.p(Ljava/awt/Component;)V")
    public void method947(Component arg0) {
        this.field1090 = new AudioFormat((float) Statics.field1112, 16, Statics.field1095 ? 2 : 1, true, false);
        this.field1093 = new byte[0x100 << (Statics.field1095 ? 2 : 1)];
    }

    @ObfuscatedName("ap.i(I)V")
    public void method949(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1090, arg0 << (Statics.field1095 ? 2 : 1));
            this.field1091 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1091.open();
            this.field1091.start();
            this.field1092 = arg0;
        } catch (LineUnavailableException var11) {
            if (class124.method1449(arg0) == 1) {
                this.field1091 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method949(var10);
        }
    }

    @ObfuscatedName("ap.o()I")
    public int method953() {
        return this.field1092 - (this.field1091.available() >> (Statics.field1095 ? 2 : 1));
    }

    @ObfuscatedName("ap.n()V")
    public void method950() {
        int var1 = 256;
        if (Statics.field1095) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1097[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1093[var2 * 2] = (byte) (var3 >> 8);
            this.field1093[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1091.write(this.field1093, 0, var1 << 1);
    }

    @ObfuscatedName("ap.l()V")
    public void method951() {
        if (this.field1091 != null) {
            this.field1091.close();
            this.field1091 = null;
        }
    }

    @ObfuscatedName("ap.v()V")
    public void method952() {
        this.field1091.flush();
    }
}
