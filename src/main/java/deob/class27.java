package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("az")
public class class27 {

    @ObfuscatedName("az.s")
    public int field599;

    @ObfuscatedName("az.c")
    public class103 field595;

    @ObfuscatedName("az.f")
    public DataInputStream field596;

    @ObfuscatedName("az.h")
    public byte[] field600 = new byte[4];

    @ObfuscatedName("az.a")
    public int field598;

    @ObfuscatedName("az.g")
    public byte[] field602;

    @ObfuscatedName("az.k")
    public int field601;

    @ObfuscatedName("az.u")
    public long field597;

    public class27(class104 arg0, URL arg1) {
        this.field595 = arg0.method1808(arg1);
        this.field599 = 0;
        this.field597 = Statics.method28() + 30000L;
    }

    @ObfuscatedName("az.s(B)[B")
    public byte[] method570() throws IOException {
        if (Statics.method28() > this.field597) {
            throw new IOException();
        }
        if (this.field599 == 0) {
            if (this.field595.field1664 == 2) {
                throw new IOException();
            }
            if (this.field595.field1664 == 1) {
                this.field596 = (DataInputStream) this.field595.field1667;
                this.field599 = 1;
            }
        }
        if (this.field599 == 1) {
            int var1 = this.field596.available();
            if (var1 > 0) {
                if (this.field598 + var1 > 4) {
                    var1 = 4 - this.field598;
                }
                this.field598 += this.field596.read(this.field600, this.field598, var1);
                if (this.field598 == 4) {
                    int var2 = (new class154(this.field600)).method2550();
                    this.field602 = new byte[var2];
                    this.field599 = 2;
                }
            }
        }
        if (this.field599 == 2) {
            int var3 = this.field596.available();
            if (var3 > 0) {
                if (this.field601 + var3 > this.field602.length) {
                    var3 = this.field602.length - this.field601;
                }
                this.field601 += this.field596.read(this.field602, this.field601, var3);
                if (this.field601 == this.field602.length) {
                    return this.field602;
                }
            }
        }
        return null;
    }
}
