package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("d")
public class class17 {

    @ObfuscatedName("d.j")
    public int field252;

    @ObfuscatedName("d.z")
    public class133 field246;

    @ObfuscatedName("d.y")
    public DataInputStream field247;

    @ObfuscatedName("d.h")
    public byte[] field257 = new byte[4];

    @ObfuscatedName("d.r")
    public int field249;

    @ObfuscatedName("d.e")
    public byte[] field250;

    @ObfuscatedName("d.k")
    public int field251;

    @ObfuscatedName("d.b")
    public long field245;

    public class17(class123 arg0, URL arg1) {
        this.field246 = arg0.method2494(arg1);
        this.field252 = 0;
        this.field245 = class103.method553() + 30000L;
    }

    @ObfuscatedName("d.j(I)[B")
    public byte[] method157() throws IOException {
        if (class103.method553() > this.field245) {
            throw new IOException();
        }
        if (this.field252 == 0) {
            if (this.field246.field2071 == 2) {
                throw new IOException();
            }
            if (this.field246.field2071 == 1) {
                this.field247 = (DataInputStream) this.field246.field2075;
                this.field252 = 1;
            }
        }
        if (this.field252 == 1) {
            int var1 = this.field247.available();
            if (var1 > 0) {
                if (this.field249 + var1 > 4) {
                    var1 = 4 - this.field249;
                }
                this.field249 += this.field247.read(this.field257, this.field249, var1);
                if (this.field249 == 4) {
                    int var2 = (new class107(this.field257)).method2135();
                    this.field250 = new byte[var2];
                    this.field252 = 2;
                }
            }
        }
        if (this.field252 == 2) {
            int var3 = this.field247.available();
            if (var3 > 0) {
                if (this.field251 + var3 > this.field250.length) {
                    var3 = this.field250.length - this.field251;
                }
                this.field251 += this.field247.read(this.field250, this.field251, var3);
                if (this.field251 == this.field250.length) {
                    return this.field250;
                }
            }
        }
        return null;
    }
}
