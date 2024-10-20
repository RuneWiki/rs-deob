package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ae")
public class class27 {

    @ObfuscatedName("ae.q")
    public int field619;

    @ObfuscatedName("ae.d")
    public class103 field610;

    @ObfuscatedName("ae.h")
    public DataInputStream field612;

    @ObfuscatedName("ae.p")
    public byte[] field613 = new byte[4];

    @ObfuscatedName("ae.j")
    public int field618;

    @ObfuscatedName("ae.n")
    public byte[] field615;

    @ObfuscatedName("ae.r")
    public int field616;

    @ObfuscatedName("ae.c")
    public long field617;

    public class27(class104 arg0, URL arg1) {
        this.field610 = arg0.method1940(arg1);
        this.field619 = 0;
        this.field617 = class156.method12() + 30000L;
    }

    @ObfuscatedName("ae.q(I)[B")
    public byte[] method611() throws IOException {
        if (class156.method12() > this.field617) {
            throw new IOException();
        }
        if (this.field619 == 0) {
            if (this.field610.field1672 == 2) {
                throw new IOException();
            }
            if (this.field610.field1672 == 1) {
                this.field612 = (DataInputStream) this.field610.field1673;
                this.field619 = 1;
            }
        }
        if (this.field619 == 1) {
            int var1 = this.field612.available();
            if (var1 > 0) {
                if (this.field618 + var1 > 4) {
                    var1 = 4 - this.field618;
                }
                this.field618 += this.field612.read(this.field613, this.field618, var1);
                if (this.field618 == 4) {
                    int var2 = (new class154(this.field613)).method2798();
                    this.field615 = new byte[var2];
                    this.field619 = 2;
                }
            }
        }
        if (this.field619 == 2) {
            int var3 = this.field612.available();
            if (var3 > 0) {
                if (this.field616 + var3 > this.field615.length) {
                    var3 = this.field615.length - this.field616;
                }
                this.field616 += this.field612.read(this.field615, this.field616, var3);
                if (this.field616 == this.field615.length) {
                    return this.field615;
                }
            }
        }
        return null;
    }
}
