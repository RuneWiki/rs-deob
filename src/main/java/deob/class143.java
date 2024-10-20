package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eb")
public final class class143 implements Runnable {

    @ObfuscatedName("eb.d")
    public InputStream field2157;

    @ObfuscatedName("eb.p")
    public OutputStream field2155;

    @ObfuscatedName("eb.v")
    public Socket field2160;

    @ObfuscatedName("eb.l")
    public boolean field2158 = false;

    @ObfuscatedName("eb.y")
    public class136 field2156;

    @ObfuscatedName("eb.w")
    public class146 field2159;

    @ObfuscatedName("eb.u")
    public byte[] field2162;

    @ObfuscatedName("eb.a")
    public int field2161 = 0;

    @ObfuscatedName("eb.e")
    public int field2154 = 0;

    @ObfuscatedName("eb.b")
    public boolean field2163 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2156 = arg1;
        this.field2160 = arg0;
        this.field2160.setSoTimeout(30000);
        this.field2160.setTcpNoDelay(true);
        this.field2160.setReceiveBufferSize(16384);
        this.field2160.setSendBufferSize(16384);
        this.field2157 = this.field2160.getInputStream();
        this.field2155 = this.field2160.getOutputStream();
    }

    @ObfuscatedName("eb.l(I)V")
    public void method2846() {
        if (this.field2158) {
            return;
        }
        synchronized (this) {
            this.field2158 = true;
            this.notifyAll();
        }
        if (this.field2159 != null) {
            while (this.field2159.field2192 == 0) {
                class127.method724(1L);
            }
            if (this.field2159.field2192 == 1) {
                try {
                    ((Thread) this.field2159.field2195).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2159 = null;
    }

    public void finalize() {
        this.method2846();
    }

    @ObfuscatedName("eb.y(I)I")
    public int method2856() throws IOException {
        return this.field2158 ? 0 : this.field2157.read();
    }

    @ObfuscatedName("eb.w(B)I")
    public int method2849() throws IOException {
        return this.field2158 ? 0 : this.field2157.available();
    }

    @ObfuscatedName("eb.u([BIII)V")
    public void method2850(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2158) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2157.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eb.a([BIII)V")
    public void method2851(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2158) {
            return;
        }
        if (this.field2163) {
            this.field2163 = false;
            throw new IOException();
        }
        if (this.field2162 == null) {
            this.field2162 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2162[this.field2154] = arg0[arg1 + var5];
                this.field2154 = (this.field2154 + 1) % 5000;
                if ((this.field2161 + 4900) % 5000 == this.field2154) {
                    throw new IOException();
                }
            }
            if (this.field2159 == null) {
                this.field2159 = this.field2156.method2762(this, 3);
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
                        if (this.field2161 == this.field2154) {
                            if (this.field2158) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2161;
                        if (this.field2154 >= this.field2161) {
                            var4 = this.field2154 - this.field2161;
                        } else {
                            var4 = 5000 - this.field2161;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2155.write(this.field2162, var3, var4);
                    } catch (IOException var12) {
                        this.field2163 = true;
                    }
                    this.field2161 = (this.field2161 + var4) % 5000;
                    try {
                        if (this.field2161 == this.field2154) {
                            this.field2155.flush();
                        }
                    } catch (IOException var11) {
                        this.field2163 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2157 != null) {
                        this.field2157.close();
                    }
                    if (this.field2155 != null) {
                        this.field2155.close();
                    }
                    if (this.field2160 != null) {
                        this.field2160.close();
                    }
                } catch (IOException var10) {
                }
                this.field2162 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2734((String) null, var15);
        }
    }
}
