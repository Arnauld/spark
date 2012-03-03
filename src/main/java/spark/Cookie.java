package spark;


public class Cookie {
    private javax.servlet.http.Cookie underlying;

    /**
     * 
     * @param underlying underlying http cookie
     * @throws NullPointerException If the underlying is null.
     */
    Cookie(javax.servlet.http.Cookie underlying) throws NullPointerException {
        if (underlying == null) {
            throw new NullPointerException();
        }
        this.underlying = underlying;
    }

    public javax.servlet.http.Cookie raw() {
        return underlying;
    }

    /**
     * @return
     * @see javax.servlet.http.Cookie#getComment()
     */
    public String comment() {
        return underlying.getComment();
    }

    /**
     * @return
     * @see javax.servlet.http.Cookie#getDomain()
     */
    public String domain() {
        return underlying.getDomain();
    }

    /**
     * @return
     * @see javax.servlet.http.Cookie#getMaxAge()
     */
    public int maxAge() {
        return underlying.getMaxAge();
    }

    /**
     * @return
     * @see javax.servlet.http.Cookie#getName()
     */
    public String name() {
        return underlying.getName();
    }

    /**
     * @return
     * @see javax.servlet.http.Cookie#getPath()
     */
    public String path() {
        return underlying.getPath();
    }

    /**
     * @return
     * @see javax.servlet.http.Cookie#getSecure()
     */
    public boolean secure() {
        return underlying.getSecure();
    }

    /**
     * @return
     * @see javax.servlet.http.Cookie#getValue()
     */
    public String value() {
        return underlying.getValue();
    }

    /**
     * @param purpose
     * @see javax.servlet.http.Cookie#setComment(java.lang.String)
     */
    public void comment(String purpose) {
        underlying.setComment(purpose);
    }

    /**
     * @param pattern
     * @see javax.servlet.http.Cookie#setDomain(java.lang.String)
     */
    public void domain(String pattern) {
        underlying.setDomain(pattern);
    }

    /**
     * @param expiry
     * @see javax.servlet.http.Cookie#setMaxAge(int)
     */
    public void maxAge(int expiry) {
        underlying.setMaxAge(expiry);
    }

    /**
     * @param uri
     * @see javax.servlet.http.Cookie#setPath(java.lang.String)
     */
    public void path(String uri) {
        underlying.setPath(uri);
    }

    /**
     * @param flag
     * @see javax.servlet.http.Cookie#setSecure(boolean)
     */
    public void secure(boolean flag) {
        underlying.setSecure(flag);
    }

    /**
     * @param newValue
     * @see javax.servlet.http.Cookie#setValue(java.lang.String)
     */
    public void value(String newValue) {
        underlying.setValue(newValue);
    }

}
