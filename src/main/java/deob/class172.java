package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fu")
public final class class172 extends class305 implements Runnable {

    @ObfuscatedName("fu.z")
    public InputStream field2043;

    @ObfuscatedName("fu.n")
    public OutputStream field2041;

    @ObfuscatedName("fu.v")
    public Socket field2051;

    @ObfuscatedName("fu.u")
    public boolean field2044 = false;

    @ObfuscatedName("fu.r")
    public class167 field2046;

    @ObfuscatedName("fu.p")
    public class166 field2042;

    @ObfuscatedName("fu.q")
    public byte[] field2047;

    @ObfuscatedName("fu.m")
    public int field2048 = 0;

    @ObfuscatedName("fu.y")
    public int field2049 = 0;

    @ObfuscatedName("fu.i")
    public boolean field2050 = false;

    @ObfuscatedName("fu.c")
    public final int field2045;

    @ObfuscatedName("fu.b")
    public final int field2052;

    public class172(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2046 = arg1;
        this.field2051 = arg0;
        this.field2045 = arg2;
        this.field2052 = arg2 - 100;
        this.field2051.setSoTimeout(30000);
        this.field2051.setTcpNoDelay(true);
        this.field2051.setReceiveBufferSize(65536);
        this.field2051.setSendBufferSize(65536);
        this.field2043 = this.field2051.getInputStream();
        this.field2041 = this.field2051.getOutputStream();
    }

    @ObfuscatedName("fu.z(B)V")
    public void method3184() {
        if (this.field2044) {
            return;
        }
        synchronized (this) {
            this.field2044 = true;
            this.notifyAll();
        }
        if (this.field2042 != null) {
            while (this.field2042.field2005 == 0) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var6) {
                }
            }
            if (this.field2042.field2005 == 1) {
                try {
                    ((Thread) this.field2042.field2001).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2042 = null;
    }

    public void finalize() {
        this.method3184();
    }

    @ObfuscatedName("fu.n(I)I")
    public int method3159() throws IOException {
        return this.field2044 ? 0 : this.field2043.read();
    }

    @ObfuscatedName("fu.v(B)I")
    public int method3177() throws IOException {
        return this.field2044 ? 0 : this.field2043.available();
    }

    @ObfuscatedName("fu.u(II)Z")
    public boolean method3156(int arg0) throws IOException {
        if (this.field2044) {
            return false;
        } else {
            return this.field2043.available() >= arg0;
        }
    }

    @ObfuscatedName("fu.r([BIII)I")
    public int method3157(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2044) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2043.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fu.p([BIII)V")
    public void method3158(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2044) {
            return;
        }
        if (this.field2050) {
            this.field2050 = false;
            throw new IOException();
        }
        if (this.field2047 == null) {
            this.field2047 = new byte[this.field2045];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2047[this.field2049] = arg0[arg1 + var5];
                this.field2049 = (this.field2049 + 1) % this.field2045;
                if ((this.field2052 + this.field2048) % this.field2045 == this.field2049) {
                    throw new IOException();
                }
            }
            if (this.field2042 == null) {
                this.field2042 = this.field2046.method3131(this, 3);
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
                        if (this.field2049 == this.field2048) {
                            if (this.field2044) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2048;
                        if (this.field2049 >= this.field2048) {
                            var4 = this.field2049 - this.field2048;
                        } else {
                            var4 = this.field2045 - this.field2048;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2041.write(this.field2047, var3, var4);
                    } catch (IOException var12) {
                        this.field2050 = true;
                    }
                    this.field2048 = (this.field2048 + var4) % this.field2045;
                    try {
                        if (this.field2049 == this.field2048) {
                            this.field2041.flush();
                        }
                    } catch (IOException var11) {
                        this.field2050 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2043 != null) {
                        this.field2043.close();
                    }
                    if (this.field2041 != null) {
                        this.field2041.close();
                    }
                    if (this.field2051 != null) {
                        this.field2051.close();
                    }
                } catch (IOException var10) {
                }
                this.field2047 = null;
                break;
            }
        } catch (Exception var15) {
            class341.method511((String) null, var15);
        }
    }

    @ObfuscatedName("fu.q([BIIB)V")
    public void method3160(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3158(arg0, arg1, arg2);
    }
}
