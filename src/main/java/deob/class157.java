package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ff")
public final class class157 extends class356 implements Runnable {

    @ObfuscatedName("ff.c")
    public InputStream field1700;

    @ObfuscatedName("ff.b")
    public OutputStream field1701;

    @ObfuscatedName("ff.p")
    public Socket field1709;

    @ObfuscatedName("ff.m")
    public boolean field1703 = false;

    @ObfuscatedName("ff.t")
    public class153 field1706;

    @ObfuscatedName("ff.s")
    public class159 field1705;

    @ObfuscatedName("ff.j")
    public byte[] field1704;

    @ObfuscatedName("ff.w")
    public int field1707 = 0;

    @ObfuscatedName("ff.n")
    public int field1708 = 0;

    @ObfuscatedName("ff.r")
    public boolean field1710 = false;

    @ObfuscatedName("ff.o")
    public final int field1702;

    @ObfuscatedName("ff.v")
    public final int field1711;

    public class157(Socket arg0, class153 arg1, int arg2) throws IOException {
        this.field1706 = arg1;
        this.field1709 = arg0;
        this.field1702 = arg2;
        this.field1711 = arg2 - 100;
        this.field1709.setSoTimeout(30000);
        this.field1709.setTcpNoDelay(true);
        this.field1709.setReceiveBufferSize(65536);
        this.field1709.setSendBufferSize(65536);
        this.field1700 = this.field1709.getInputStream();
        this.field1701 = this.field1709.getOutputStream();
    }

    @ObfuscatedName("ff.c(I)V")
    public void method2817() {
        if (this.field1703) {
            return;
        }
        synchronized (this) {
            this.field1703 = true;
            this.notifyAll();
        }
        if (this.field1705 != null) {
            while (this.field1705.field1726 == 0) {
                class417.method5965(1L);
            }
            if (this.field1705.field1726 == 1) {
                try {
                    ((Thread) this.field1705.field1730).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1705 = null;
    }

    public void finalize() {
        this.method2817();
    }

    @ObfuscatedName("ff.b(B)I")
    public int method2814() throws IOException {
        return this.field1703 ? 0 : this.field1700.read();
    }

    @ObfuscatedName("ff.p(I)I")
    public int method2815() throws IOException {
        return this.field1703 ? 0 : this.field1700.available();
    }

    @ObfuscatedName("ff.m(II)Z")
    public boolean method2816(int arg0) throws IOException {
        if (this.field1703) {
            return false;
        } else {
            return this.field1700.available() >= arg0;
        }
    }

    @ObfuscatedName("ff.t([BIIS)I")
    public int method2813(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1703) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1700.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("ff.s([BIIB)V")
    public void method2837(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1703) {
            return;
        }
        if (this.field1710) {
            this.field1710 = false;
            throw new IOException();
        }
        if (this.field1704 == null) {
            this.field1704 = new byte[this.field1702];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1704[this.field1708] = arg0[arg1 + var5];
                this.field1708 = (this.field1708 + 1) % this.field1702;
                if ((this.field1711 + this.field1707) % this.field1702 == this.field1708) {
                    throw new IOException();
                }
            }
            if (this.field1705 == null) {
                this.field1705 = this.field1706.method2776(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1708 == this.field1707) {
                            if (this.field1703) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1707;
                        if (this.field1708 >= this.field1707) {
                            var4 = this.field1708 - this.field1707;
                        } else {
                            var4 = this.field1702 - this.field1707;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1701.write(this.field1704, var3, var4);
                    } catch (IOException var12) {
                        this.field1710 = true;
                    }
                    this.field1707 = (this.field1707 + var4) % this.field1702;
                    try {
                        if (this.field1708 == this.field1707) {
                            this.field1701.flush();
                        }
                    } catch (IOException var11) {
                        this.field1710 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1700 != null) {
                        this.field1700.close();
                    }
                    if (this.field1701 != null) {
                        this.field1701.close();
                    }
                    if (this.field1709 != null) {
                        this.field1709.close();
                    }
                } catch (IOException var10) {
                }
                this.field1704 = null;
                break;
            }
        } catch (Exception var15) {
            class443.method6513((String) null, var15);
        }
    }

    @ObfuscatedName("ff.j([BIII)V")
    public void method2834(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2837(arg0, arg1, arg2);
    }
}
