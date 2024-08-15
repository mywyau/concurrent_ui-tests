package blog.crud_blog_posts

trait Selectors {

  val firstBlogPostReadMeLink = "#root > div > main > div > ul > li:nth-child(1) > div > a"

  val updatedBlogPostH1 = "#root > div > main > div > div:nth-child(1) > div > h1"
//  val postIdContentH1 = "#root > div > main > div > div:nth-child(1) > div > h1"

  val navBarCreatePostButton = "#create-blog-post"

  val createPostPageH1Selector = "#root > div > div > h1"

  val titleFormInput = "#root > div > div > div > form > div:nth-child(1) > label > input"
  val blogPostIdFormInput = "#root > div > div > div > form > div:nth-child(2) > label > input"
  val createBlogPostTextArea = "#root > div > div > div > form > div.mt-4.mb-4 > label > textarea"

  val createBlogPostButton = "#root > div > div > div > form > button"
  val deleteAllBlogPostsButton = "#root > div > main > div > div.flex.space-x-4 > form > div > button"

  val deleteMessageParagraph = "#root > div > main > div > div > form > div > div > p"


}
