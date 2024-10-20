package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fc")
public final class class157 extends class361 implements Runnable {

    @ObfuscatedName("fc.c")
    public InputStream field1713;

    @ObfuscatedName("fc.l")
    public OutputStream field1710;

    @ObfuscatedName("fc.s")
    public Socket field1714;

    @ObfuscatedName("fc.e")
    public boolean field1712 = false;

    @ObfuscatedName("fc.r")
    public class153 field1716;

    @ObfuscatedName("fc.o")
    public class159 field1715;

    @ObfuscatedName("fc.i")
    public byte[] field1722;

    @ObfuscatedName("fc.w")
    public int field1717 = 0;

    @ObfuscatedName("fc.v")
    public int field1718 = 0;

    @ObfuscatedName("fc.a")
    public boolean field1719 = false;

    @ObfuscatedName("fc.y")
    public final int field1720;

    @ObfuscatedName("fc.u")
    public final int field1721;

    public class157(Socket arg0, class153 arg1, int arg2) throws IOException {
        this.field1716 = arg1;
        this.field1714 = arg0;
        this.field1720 = arg2;
        this.field1721 = arg2 - 100;
        this.field1714.setSoTimeout(30000);
        this.field1714.setTcpNoDelay(true);
        this.field1714.setReceiveBufferSize(65536);
        this.field1714.setSendBufferSize(65536);
        this.field1713 = this.field1714.getInputStream();
        this.field1710 = this.field1714.getOutputStream();
    }

    @ObfuscatedName("fc.c(I)V")
    public void method2780() {
        if (this.field1712) {
            return;
        }
        synchronized (this) {
            this.field1712 = true;
            this.notifyAll();
        }
        if (this.field1715 != null) {
            while (this.field1715.field1738 == 0) {
                class263.method5249(1L);
            }
            if (this.field1715.field1738 == 1) {
                try {
                    ((Thread) this.field1715.field1732).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1715 = null;
    }

    public void finalize() {
        this.method2780();
    }

    @ObfuscatedName("fc.l(B)I")
    public int method2782() throws IOException {
        return this.field1712 ? 0 : this.field1713.read();
    }

    @ObfuscatedName("fc.s(I)I")
    public int method2810() throws IOException {
        return this.field1712 ? 0 : this.field1713.available();
    }

    @ObfuscatedName("fc.e(IB)Z")
    public boolean method2784(int arg0) throws IOException {
        if (this.field1712) {
            return false;
        } else {
            return this.field1713.available() >= arg0;
        }
    }

    @ObfuscatedName("fc.r([BIII)I")
    public int method2781(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1712) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1713.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fc.o([BIIS)V")
    public void method2793(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1712) {
            return;
        }
        if (this.field1719) {
            this.field1719 = false;
            throw new IOException();
        }
        if (this.field1722 == null) {
            this.field1722 = new byte[this.field1720];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1722[this.field1718] = arg0[arg1 + var5];
                this.field1718 = (this.field1718 + 1) % this.field1720;
                if ((this.field1721 + this.field1717) % this.field1720 == this.field1718) {
                    throw new IOException();
                }
            }
            if (this.field1715 == null) {
                this.field1715 = this.field1716.method2751(this, 3);
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
                        if (this.field1718 == this.field1717) {
                            if (this.field1712) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1717;
                        if (this.field1718 >= this.field1717) {
                            var4 = this.field1718 - this.field1717;
                        } else {
                            var4 = this.field1720 - this.field1717;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1710.write(this.field1722, var3, var4);
                    } catch (IOException var12) {
                        this.field1719 = true;
                    }
                    this.field1717 = (this.field1717 + var4) % this.field1720;
                    try {
                        if (this.field1718 == this.field1717) {
                            this.field1710.flush();
                        }
                    } catch (IOException var11) {
                        this.field1719 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1713 != null) {
                        this.field1713.close();
                    }
                    if (this.field1710 != null) {
                        this.field1710.close();
                    }
                    if (this.field1714 != null) {
                        this.field1714.close();
                    }
                } catch (IOException var10) {
                }
                this.field1722 = null;
                break;
            }
        } catch (Exception var15) {
            class445.method3452((String) null, var15);
        }
    }

    @ObfuscatedName("fc.i([BIII)V")
    public void method2788(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2793(arg0, arg1, arg2);
    }
}
