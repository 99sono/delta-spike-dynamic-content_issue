# delta-spike-dynamic-content_issue

This project contains an index.xhtml that tries to load the image of a dog through different means, namely:

<ul>
<li> A static jsf resource[] , which works without problem
<li> A static jsf resource whose string for the resource comes out of ViewAccessScoped bean, which works without problem.
<li> A dynamic primefaces graphic stream coming out a ViewAccessScoped bean property, which does not work, as it appears that view access scope is not enabled when Primefaces dnynamic resource handler tries to evaluate the index.xhtml EL expression

<li> A static jsf resource whose string for the resource comes out of RequestScoped bean, which works without problem.
<li> A dynamic primefaces graphic stream coming out a RequestScoped bean property, which works without problem
</ul>


<P> I am opening the issue as a delta-spike probkem, since all standard scoped beans work with prime faces but the especially scoped beans that fall under the delta spike unbrella do not work.
However, the prime-faces code also seems to hint that their specialized dynamic content resource handler is bypassing the normal flow of the standard resource handler to handle their special use case.... 

<P> Ideally either priemfaces or delta-spike would come together to find a resolution to allow view scoped beans to be allowed to host the dynamic content of a page.


<P> Please visit the resources folder for a .docx that illustrates the issue.

