package blog.crud_blog_posts

trait BlogSelectors {

  def blogPostH2Link(title: String) = s"#${title.replaceAll(" ", "-")}-link"

  def blogPostReadMeLink(i: Int) = s"#read-more-blog-post-$i"

  def blogPostH1(postId: String) = s"#blog-post-${postId}"

  def editPostButton() = s"#edit-blog-post-button"

  val navBarCreatePostButton = "#create-blog-post"

  val createPostPageH1Selector = "#create-post"

  val titleFormInput = "#root > div > div > div > form > div:nth-child(1) > label > input"
  val blogPostIdFormInput = "#root > div > div > div > form > div:nth-child(2) > label > input"
  val createBlogPostTextArea = "#root > div > div > div > form > div.mt-4.mb-4 > label > textarea"

  val createBlogPostButton = "#root > div > div > div > form > button"
  val deleteAllBlogPostsButton = "#root > div > main > div > div.flex.space-x-4 > form > div > button"
  val deleteSingleBlogPostsButton = "#delete-blog-post"

  val deleteMessageParagraph = "#delete-button-response-body"


}
