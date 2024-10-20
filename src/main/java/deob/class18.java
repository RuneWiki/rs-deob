package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("i")
public class class18 {

    @ObfuscatedName("i.p")
    public int field250;

    @ObfuscatedName("i.k")
    public class138 field241;

    @ObfuscatedName("i.e")
    public DataInputStream field242;

    @ObfuscatedName("i.f")
    public byte[] field252 = new byte[4];

    @ObfuscatedName("i.w")
    public int field244;

    @ObfuscatedName("i.t")
    public byte[] field247;

    @ObfuscatedName("i.s")
    public int field246;

    @ObfuscatedName("i.c")
    public long field245;

    public class18(class128 arg0, URL arg1) {
        this.field241 = arg0.method2559(arg1);
        this.field250 = 0;
        this.field245 = class107.method579() + 30000L;
    }

    @ObfuscatedName("i.p(B)[B")
    public byte[] method171() throws IOException {
        if (class107.method579() > this.field245) {
            throw new IOException();
        }
        if (this.field250 == 0) {
            if (this.field241.field2118 == 2) {
                throw new IOException();
            }
            if (this.field241.field2118 == 1) {
                this.field242 = (DataInputStream) this.field241.field2125;
                this.field250 = 1;
            }
        }
        if (this.field250 == 1) {
            int var1 = this.field242.available();
            if (var1 > 0) {
                if (this.field244 + var1 > 4) {
                    var1 = 4 - this.field244;
                }
                this.field244 += this.field242.read(this.field252, this.field244, var1);
                if (this.field244 == 4) {
                    int var2 = (new class111(this.field252)).method2350();
                    this.field247 = new byte[var2];
                    this.field250 = 2;
                }
            }
        }
        if (this.field250 == 2) {
            int var3 = this.field242.available();
            if (var3 > 0) {
                if (this.field246 + var3 > this.field247.length) {
                    var3 = this.field247.length - this.field246;
                }
                this.field246 += this.field242.read(this.field247, this.field246, var3);
                if (this.field246 == this.field247.length) {
                    return this.field247;
                }
            }
        }
        return null;
    }
}
